package ca.bcit.comp2522.lab3;

import java.util.Objects;

/**
 * Represents an IPhone16 device.
 * Extends the {@code IPhone} class and provides additional attributes and behavior
 * such as a high-resolution camera and memory capacity.
 * @author Lucas Liu
 * @author Kyle Cheon
 * @version 1.0
 */
public class IPhone16 extends IPhone{
    /*
     * Minimum allowed memory in gigabytes.
     */
    private static final int MINIMUM_MEMORY = 0;

    /*
     * Indicates if the IPhone16 has a high-resolution camera.
     */
    private final boolean highResCamera;
    /*
     * Memory capacity of the IPhone16 in gigabytes.
     */
    private final int memoryGb;

    /**
     * Constructs an IPhone16 object with the specified parameters.
     *
     * @param minutesRemaining the remaining minutes on the IPhone.
     * @param carrier          the carrier associated with the IPhone.
     * @param hasHighResCamera whether the IPhone16 has a high-resolution camera.
     * @param memoryGb         the memory capacity of the IPhone16 in gigabytes.
     * @throws IllegalArgumentException if {@code memoryGb <= MINIMUM_MEMORY}.
     */
    public IPhone16(final double minutesRemaining,
                    final String carrier,
                    final boolean hasHighResCamera,
                    final int memoryGb) {
        super(minutesRemaining, carrier);

        validateMemoryGb(memoryGb);

        this.highResCamera = hasHighResCamera;
        this.memoryGb = memoryGb;
    }

    /**
     * Returns whether the IPhone16 has a high-resolution camera.
     *
     * @return {@code true} if the IPhone16 has a high-resolution camera; {@code false} otherwise.
     */
    public boolean HasHighResCamera() {
        return highResCamera;
    }

    /**
     * Returns the memory capacity of the IPhone16 in gigabytes.
     *
     * @return the memory capacity.
     */
    public int getMemoryGb() {
        return memoryGb;
    }

    /**
     * Returns a string representation of the IPhone16.
     * Includes details from the superclass and additional properties of the IPhone16.
     *
     * @return a string describing the IPhone16.
     */
    @Override
    public String toString() {
        String details;
        details = super.toString() +
                  " has HighResCamera: " +
                  highResCamera +
                  " memoryGb: " + memoryGb;
        return details;
    }

    /**
     * Compares this IPhone16 with another object for equality.
     * Two IPhone16 objects are considered equal if they have the same properties, including
     * high-resolution camera capability and memory.
     *
     * @param obj the object to compare with.
     * @return {@code true} if the objects are equal; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(obj == null || !(obj instanceof IPhone16)){
            return false;
        }
        IPhone other = (IPhone) obj;
        if(super.equals(other) && this.highResCamera == ((IPhone16) obj).HasHighResCamera()){
            return true;
        }
        return false;
    }

    /**
     * Returns the hash code for this IPhone16.
     * Includes the hash codes of minutes remaining and the high-resolution camera flag.
     *
     * @return the hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(Double.hashCode(this.getMinutesRemaining()), Boolean.hashCode(this.highResCamera));
    }

    /*
     * Validates the memory capacity of the IPhone16.
     *
     * @param memoryGb the memory capacity to validate.
     * @throws IllegalArgumentException if {@code memoryGb <= MINIMUM_MEMORY}.
     */
    private static void validateMemoryGb(final int memoryGb){
        if(memoryGb <= MINIMUM_MEMORY){
            throw new IllegalArgumentException("Memory gb must be greater than " + MINIMUM_MEMORY);
        }
    }
}
