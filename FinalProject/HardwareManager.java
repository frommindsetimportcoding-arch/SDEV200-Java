// Nathan Thomas
// Final Project
// This class is designed to scan for USB port connections. Parse incoming byte data using switch statements. 

// package com.project.midi.controller;

import javax.sound.midi.*;
import java.util.ArrayList;
import java.util.List;

public class HardwareManager
{
    private MidiDevice inputDevice;
    private ChordFormula activeFormula = ChordFormula.MINOR_7TH; // Default construction.

    /**
     * Scans the system for active physical or virtual USB MIDI controllers.
     */
    public List<MidiDevice.Info> scanDevices()
    {
        List<MidiDevice.Info> controllers = new ArrayList<>();
        MidiDevice.Info[] infos = MidiSystem.getMidiDeviceInfo();

        for (MidiDevice.Info info : infos)
        {
            try
            {
                MidiDevice device = MidiSystem.getMidiDevice(info);
                // Filters for devices capable of transmitting data (as MIDI)
                // Also ignores Java's internal software engines, since they are not active
                // physical instrument streams.
                if (device.getMaxTransmitters() != 0 && !info.getName().contains("Sequencer"))
                {
                    controllers.add(info);
                }
            }
            catch (MidiUnavailableException e)
            {
                System.err.println("Skipping unreadable device: " + info.getName());
            }
        }
        return controllers;
    }
    // Still need to connect to the device and bind to it for continue input
    // listening.

    public void connectDevice(MidiDevice.Info deviceInfo) throws MidiUnavailableException
    {
        if (inputDevice != null && inputDevice.isOpen())
        {
            inputDevice.close();
        }

        inputDevice = MidiSystem.getMidiDevice(deviceInfo);
        inputDevice.open();

        Transmitter transmitter = inputDevice.getTransmitter();
        transmitter.setReceiver(new MidiInputReceiver());
        System.out.println("Successfully hooked stream to: " + deviceInfo.getName());
    }

    public void setActiveFormula(ChordFormula formula)
    {
        this.activeFormula = formula;
    }

    /**
     * Inner class implementing the core Java MIDI pipeline callback
     */
    private class MidiInputReceiver implements Receiver
    {
        @Override
        public void send(MidiMessage message, long timeStamp)
        {
            if (message instanceof ShortMessage)
            {
                ShortMessage sm = (ShortMessage) message;
                int command = sm.getCommand();
                int key = sm.getData1();
                int velocity = sm.getData2();

                // Selection and logic processing of real-time stream status bytes
                switch (command)
                {
                    case ShortMessage.NOTE_ON:
                        if (velocity > 0)
                        {
                            processNoteOn(key, velocity);
                        }
                        else
                        {
                            processNoteOff(key); // some controllers will send a velocity of 0 for note off.
                        }
                        break;
                    case ShortMessage.NOTE_OFF:
                        processNoteOff(key);
                        break;
                }
            }
        }

        private void processNoteOn(int rootNote, int velocity)
        {
            int[] chordPitches = activeFormula.generateChordNotes(rootNote);
            System.out.print("Triggered " + activeFormula.getName() + " -> ");
            for (int note : chordPitches)
            {
                System.out.print(note + " ");
            }
            System.out.println("[Velocity: " + velocity + "]");

            // TODO: Pass chordPitches array to SwingUI thread via
            // SwingUtilities.invokelater()
        }

        private void processNoteOff(int rootNote)
        {
            // Will handle stopping notes
        }

        @Override
        public void close()
        {
            System.out.println("MIDI stream detached safely.");
        }
    }
}
