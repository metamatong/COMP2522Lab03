package ca.bcit.comp2522.lab3;

import java.util.Objects;
/**
 * Represents an IPod device.
 * Extends the {@code IDevice} class and provides specific attributes and behavior
 * related to the IPod, such as number of songs and maximum volume.
 * <p>
 * Purpose: {@code DEVICE_PURPOSE = "music"}
 * @author Kyle Cheon
 * @author Lucas Liu
 * @verion 1.0
 *
 */
public class IPod extends IDevice
{

    /*
     * Default purpose of the device.
     */
    private final static String DEVICE_PURPOSE = "music";
    /*
     * Minimum number of songs allowed.
     */
    private final static int MINIMUM_SONGS = 1;
    /*
     * Minimum volume in decibels (DB) allowed.
     */
    private final static double MINIMUM_VOLUME = 0.0;

    /*
     * Number of songs the IPod can hold.
     */
    private int numOfSong;
    /*
     * Maximum volume of the IPod in decibels (DB).
     */
    private double maximumVolumeDB;

    /**
     * Constructs an IPod object with the specified number of songs and maximum volume.
     *
     * @param numOfSong       the number of songs the IPod can hold.
     * @param maximumVolumeDB the maximum volume in decibels.
     * @throws IllegalArgumentException if {@code numOfSong < MINIMUM_SONGS}
     *                                  or {@code maximumVolumeDB < MINIMUM_VOLUME}.
     */
    public IPod(final int numOfSong,
                final double maximumVolumeDB)
    {
        super(DEVICE_PURPOSE);

        validateNumOfSong(numOfSong);
        validateMaximumVolumeDB(maximumVolumeDB);

        this.numOfSong = numOfSong;
        this.maximumVolumeDB = maximumVolumeDB;
    }

    /**
     * Returns the maximum volume in decibels (DB).
     *
     * @return the maximum volume.
     */
    public double getMaximumVolumeDB()
    {
        return maximumVolumeDB;
    }

    /**
     * Returns the number of songs the IPod can hold.
     *
     * @return the number of songs.
     */
    public int getNumOfSong()
    {
        return numOfSong;
    }

    /**
     * Sets the number of songs the IPod can hold.
     *
     * @param numOfSong the number of songs.
     * @throws IllegalArgumentException if {@code numOfSong < MINIMUM_SONGS}.
     */
    public void setNumOfSong(final int numOfSong)
    {
        validateNumOfSong(numOfSong);
        this.numOfSong = numOfSong;
    }

    /**
     * Sets the maximum volume in decibels (DB).
     *
     * @param maximumVolumeDB the maximum volume.
     * @throws IllegalArgumentException if {@code maximumVolumeDB < MINIMUM_VOLUME}.
     */
    public void setMaximumVolumeDB(final double maximumVolumeDB)
    {
        validateMaximumVolumeDB(maximumVolumeDB);
        this.maximumVolumeDB = maximumVolumeDB;
    }

    /**
     * Prints the details of the IPod.
     * Includes purpose, number of songs, and maximum volume.
     */
    @Override
    void printDetails()
    {
        String details;
        details = "The purpose of this device is " +
                  super.toString() +
                  "This Ipod holds " +
                  numOfSong +
                  " has maximum Volume of " +
                  maximumVolumeDB +
                  " DBs";
        System.out.println(details);
    }

    /**
     * Returns a string representation of the IPod.
     *
     * @return a string describing the IPod.
     */
    @Override
    public String toString()
    {
        String details;
        details = "The purpose of this device is " +
                  super.toString() +
                  "This Ipod holds " +
                  numOfSong +
                  " has maximum Volume of " +
                  maximumVolumeDB +
                  " DBs";
        return details;
    }

    /**
     * Compares this IPod with another object for equality.
     * Two IPods are equal if they have the same number of songs.
     *
     * @param obj the object to compare with.
     * @return {@code true} if the objects are equal; {@code false} otherwise.
     */
    @Override
    public boolean equals(final Object obj)
    {
        if(obj == this)
        {
            return true;
        }
        if(obj == null || !(obj instanceof IPod))
        {
            return false;
        }
        IPod ipod = (IPod)obj;
        if(this.numOfSong != ipod.getNumOfSong()){
            return false;
        }
        return true;
    }

    /**
     * Returns the hash code for this IPod.
     * Based on the number of songs.
     *
     * @return the hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(numOfSong);
    }

    /**
     * Validates the number of songs.
     *
     * @param numOfSong the number of songs to validate.
     * @throws IllegalArgumentException if {@code numOfSong < MINIMUM_SONGS}.
     */
    private static void validateNumOfSong(final int numOfSong)
    {
        if (numOfSong < MINIMUM_SONGS) {
            throw new IllegalArgumentException();
        }
    }

    /*
     * Validates the maximum volume in decibels (DB).
     *
     * @param maximumVolumeDB the maximum volume to validate.
     * @throws IllegalArgumentException if {@code maximumVolumeDB < MINIMUM_VOLUME}.
     */
    private static void validateMaximumVolumeDB(final double maximumVolumeDB)
    {
        if(maximumVolumeDB < MINIMUM_VOLUME) {
            throw new IllegalArgumentException();
        }
    }
}
