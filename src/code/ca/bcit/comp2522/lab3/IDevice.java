package ca.bcit.comp2522.lab3;

/**
 * The {@code IDevice} abstract class represents a generic device with a specific purpose.
 *
 * <p>
 *     This class serves as a foundational blueprint for various device implementations,
 *     ensuring that each device maintains a defined purpose. Subclasses of {@code IDevice}
 *     must provide concrete implementations for printing details and standard object methods.
 * </p>
 *
 * <p>The {@code IDevice} class provides the following functionality:</p>
 * <ul>
 *   <li>Construction of a device with a specific purpose.</li>
 *   <li>Retrieval of the device's purpose.</li>
 *   <li>Abstract method to print detailed information about the device.</li>
 *   <li>Standard overrides for {@code toString()}, {@code equals(Object)}, and {@code hashCode()} methods.</li>
 * </ul>
 *
 * <p>
 *     The purpose of the device is validated to ensure it is neither null nor empty.
 *     An {@code IllegalArgumentException} is thrown if the purpose is invalid.
 * </p>
 *
 * @author Kyle Cheon
 * @author Lucas Liu
 * @version 1.0
 */
public abstract class IDevice {

    private final String purpose;

    /**
     * Constructs a new {@code IDevice} instance with the predefined purpose.*
     */
    IDevice()
    {
        this.purpose = "IDevice";
    }

    /*
     * Retrieves the purpose of the device.
     *
     * return the purpose of the device.
     */
    private final String getPurpose()
    {
        return this.purpose;
    }

    /**
     * Prints detailed information about the device.
     *
     * <p>
     *     Subclasses must provide a concrete implementation of this method to display
     *     device-specific details.
     * </p>
     */
    abstract void printDetails();

    /**
     * Returns a string representation of the device.
     *
     * <p>
     *     Subclasses must override this method to provide a meaningful string representation
     *     of the device.
     * </p>
     *
     * @return a string representation of the device.
     */
    @Override
    public String toString()
    {
        String string = "Purpose: " + this.getPurpose() + "\n";
        return string;
    }

    /**
     * Compares this device to the specified object for equality.
     *
     * <p>
     *     Subclasses must override this method to define equality based on device-specific
     *     attributes.
     * </p>
     *
     * @param obj the object to compare with.
     * @return {@code true} if the devices are equal; {@code false} otherwise.
     */
    @Override
    public abstract boolean equals(Object obj);

    /**
     * Returns a hash code value for the device.
     *
     * <p>
     *     Subclasses must override this method to provide a hash code consistent with
     *     the {@code equals(Object)} method.
     * </p>
     *
     * @return a hash code value for the device.
     */
    @Override
    public abstract int hashCode();
}