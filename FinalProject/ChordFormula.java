// Nathan Thomas
// Final Project

// package com.project.midi.model;

/**
 * Useful for debugging arrays when needed.
 * import java.util.Arrays;
 */

public class ChordFormula
{
    private final String name;
    // This will construct the intervals from root note to be applied when building
    // ChordForumla objects.
    private final int[] intervals;

    public static final ChordFormula MAJOR_7TH = new ChordFormula("Major 7th", new int[] { 0, 4, 7, 11 });
    public static final ChordFormula MINOR_7TH = new ChordFormula("Major 7th", new int[] { 0, 3, 7, 10 });
    public static final ChordFormula MAJOR_9TH = new ChordFormula("Major 9th", new int[] { 0, 4, 7, 11, 14 });
    public static final ChordFormula MINOR_9TH = new ChordFormula("Minor 9th", new int[] { 0, 3, 7, 10, 14 });

    public ChordFormula(String name, int[] intervals)
    {
        this.name = name;
        this.intervals = intervals;
    }

    /**
     * Generates an array of absolute MIDI note pitches based on a root note.
     * Includes boundaries to keep notes within conventional MIDI bounds (0-127).
     */

    public int[] generateChordNotes(int rootNote)
    {
        int[] chordNotes = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++)
        {
            int targetNote = rootNote + intervals[i];

            // Selection and Boundary Logic
            if (targetNote > 127)
            {
                chordNotes[i] = 127; // Sets max value
            }
            else
            {
                chordNotes[i] = targetNote;
            }
        }
        return chordNotes;
    }

    public String getName()
    {
        return name;
    }
}
