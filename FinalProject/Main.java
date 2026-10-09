
// Nathan Thomas
// Final Project
/** This is the Main. Which will use the HardwareManager to find, select and connect to a 
  * compatible MIDI capable device. When finished, the application will terminate the connection. 
  * The ChordFormula will accept input, translate it into a MIDI value and assign it a root interval.
  * Given a chord formula, it will construct the appropriate intervals for said formula.
*/

import javax.sound.midi.MidiDevice;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("=====================================================");
        System.out.println("  Dynamic MIDI Chord Palette and Performance Mapper  ");
        System.out.println("=====================================================");

        // Initialize the hardware manager backend.
        HardwareManager hardware = new HardwareManager();

        // Scan the computer for available ports
        List<MidiDevice.Info> discoveredDevices = hardware.scanDevices();

        // Validation check if no MIDI capable devices are connected.
        if (discoveredDevices.isEmpty())
        {
            System.out.println("\n[!] No MIDI input hardware or virtual buses detected.");
            System.out.println("-- Please connect a USB MIDI device or launch a virtual port.");
            return;
        }

        // Looper through and display the hardware portfolio options.
        System.out.println("\nAvaialble MIDI Input Devices Detected:");
        for (int i = 0; i < discoveredDevices.size(); i++)
        {
            MidiDevice.Info info = discoveredDevices.get(i);
            System.out.println("[" + i + "]" + info.getName() + " - " + info.getDescription());
        }

        // Scanner input loop for choosing the active bus
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the device number to bind connection: ");

        int choice = -1;
        if (scanner.hasNextInt())
        {
            choice = scanner.nextInt();
        }

        // Boundary validation checks
        if (choice < 0 || choice >= discoveredDevices.size())
        {
            System.out.println("Invalid selection. Aborting application execution.");
            scanner.close();
            return;
        }

        // Trying to open the interface port and hook up data pipelines.
        try
        {
            MidiDevice.Info targetedDevice = discoveredDevices.get(choice);
            hardware.connectDevice(targetedDevice);

            System.out.println("\n[SUCCESS] Pipeline connected to real-time streams.");
            System.out.println("-- Play not triggers on the hardware to generate chord arrays.");
            System.out.println("-- (Terminate terminal stream processing with Ctrl+C at any time)\n");

            while (true)
            {
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.err.println("\n[CRITICAL ERROR] Failed to initialize hardware processing sequence:");
            e.printStackTrace();
        }
        finally
        {
            scanner.close();
        }
    }
}
