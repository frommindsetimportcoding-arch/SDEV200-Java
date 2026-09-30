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
                // Filters for devices capable of transmitting data (as midi)
                if (device.getMaxTransmitters() != 0)
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
}
