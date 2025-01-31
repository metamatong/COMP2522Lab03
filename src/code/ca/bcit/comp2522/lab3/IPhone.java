package ca.bcit.comp2522.lab3;

import java.util.Objects;
/**
 * Represents an IPhone device.
 * Extends the {@code IDevice} class and provides specific attributes and behavior
 * related to the IPhone, such as remaining minutes and carrier information.
 * <p>
 * Purpose: {@code DEVICE_PURPOSE = "talking"}
 */
public class IPhone extends IDevice
{

    /**
     * Default purpose of the device.
     */
    private static final String DEVICE_PURPOSE = "talking";
    /**
     * Minimum allowed value for minutes remaining.
     */
    private static final double MINIMUM_MINUTES = 0.0;

    /**
     * Remaining minutes on the IPhone.
     */
    private double minutesRemaining;
    /**
     * The carrier associated with the IPhone.
     */
    private String carrier;

    /**
     * Constructs an IPhone object with the specified minutes remaining and carrier.
     *
     * @param minutesRemaining the remaining minutes on the IPhone.
     * @param carrier          the carrier associated with the IPhone.
     * @throws IllegalArgumentException if {@code minutesRemaining < MINIMUM_MINUTES}
     *                                  or if {@code carrier} is null or empty.
     */
    public IPhone(final double minutesRemaining,
                  final String carrier)
    {
        super(DEVICE_PURPOSE);

        validateMinutesRemaining(minutesRemaining);
        validateCarrier(carrier);

        this.minutesRemaining = minutesRemaining;
        this.carrier = carrier;
    }

    /**
     * Returns the remaining minutes on the IPhone.
     *
     * @return the remaining minutes.
     */
    public double getMinutesRemaining()
    {
        return minutesRemaining;
    }

    /**
     * Sets the remaining minutes on the IPhone.
     *
     * @param minutesRemaining the remaining minutes.
     */
    public void setMinutesRemaining(final double minutesRemaining)
    {
        validateMinutesRemaining(minutesRemaining);

        this.minutesRemaining = minutesRemaining;
    }

    /**
     * Returns the carrier associated with the IPhone.
     *
     * @return the carrier name.
     */
    public String getCarrier()
    {
        return carrier;
    }

    /**
     * Prints the details of the IPhone.
     * Includes purpose, remaining minutes, and carrier information.
     */
    @Override
    void printDetails()
    {
        String details;
        details = "The purpose of this device is " +
                super.toString() +
                "This IPhone has " +
                minutesRemaining +
                " minutes left and is with " +
                carrier +
                " DBs";
        System.out.println(details);
    }

    /**
     * Compares this IPhone with another object for equality.
     * Two IPhones are considered equal if they have the same remaining minutes.
     *
     * @param obj the object to compare with.
     * @return {@code true} if the objects are equal; {@code false} otherwise.
     */
    @Override
    public boolean equals(final Object obj)
    {
        if(this == obj)
        {
            return true;
        }
        if(obj == null || !(obj instanceof IPhone))
        {
            return false;
        }
        IPhone other = (IPhone) obj;
        if(this.minutesRemaining == other.getMinutesRemaining())
        {
            return true;
        }
        return false;
    }

    /**
     * Returns the hash code for this IPhone.
     * Based on the remaining minutes.
     *
     * @return the hash code.
     */
    @Override
    public int hashCode()
    {
        return Objects.hashCode(minutesRemaining);
    }

    /*
     * Validates the remaining minutes.
     *
     * @param minutesRemaining the remaining minutes to validate.
     * @throws IllegalArgumentException if {@code minutesRemaining < MINIMUM_MINUTES}.
     */
    private void validateMinutesRemaining(final double minutesRemaining)
    {
        if(minutesRemaining < MINIMUM_MINUTES)
        {
            throw new IllegalArgumentException("Minutes remaining is less than minutes remaining");
        }
    }

    /*
     * Validates the carrier name.
     *
     * @param carrier the carrier name to validate.
     * @throws IllegalArgumentException if {@code carrier} is null or empty.
     */
    private void validateCarrier(final String carrier)
    {
        if(carrier == null || carrier.isEmpty())
        {
            throw new IllegalArgumentException("Carrier is empty");
        }

    }

}
