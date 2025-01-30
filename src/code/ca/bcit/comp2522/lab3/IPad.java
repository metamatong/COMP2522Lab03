package ca.bcit.comp2522.lab3;

/**
 * Represents an IPad device.
 * Extends the {@code IDevice} class and provides specific attributes and behavior
 * related to the IPad, such as whether it has a case and the operating system version.
 * <p>
 * Purpose: {@code DEVICE_PURPOSE = "learning"}
 * @author Kyle Cheon
 * @author Lucas Liu
 * @version 1.0
 */
public class IPad extends IDevice{
    /*
     * Default purpose of the device.
     */
    private static final String DEVICE_PURPOSE = "learning";

    /*
     * Indicates if the IPad has a case.
     */
    private boolean hasCase;
    /*
     * The operating system version of the IPad.
     */
    private String operatingSystemVersion;

    /**
     * Constructs an IPad object with the specified case status and operating system version.
     *
     * @param hasCase             whether the IPad has a case.
     * @param operatingSystemVersion the operating system version of the IPad.
     * @throws IllegalArgumentException if {@code operatingSystemVersion} is null or empty.
     */
    public IPad(final boolean hasCase,
                final String operatingSystemVersion) {
        super(DEVICE_PURPOSE);

        validateOperatingSystemVersion(operatingSystemVersion);

        this.hasCase = hasCase;
        this.operatingSystemVersion = operatingSystemVersion;
    }

    /**
     * Returns whether the IPad has a case.
     *
     * @return {@code true} if the IPad has a case; {@code false} otherwise.
     */
    public boolean isHasCase() {
        return hasCase;
    }

    /**
     * Returns the operating system version of the IPad.
     *
     * @return the operating system version.
     */
    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }

    /**
     * Sets whether the IPad has a case.
     *
     * @param hasCase {@code true} if the IPad has a case; {@code false} otherwise.
     */
    public void setCase(final boolean hasCase) {
        this.hasCase = hasCase;
    }

    /*
     * Sets the operating system version of the IPad.
     *
     * @param operatingSystemVersion the operating system version.
     * @throws IllegalArgumentException if {@code operatingSystemVersion} is null or empty.
     */
    public void setOperatingSystemVersion(final String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
    }

    /**
     * Prints the details of the IPad.
     * Includes purpose, case status, and operating system version.
     */
    @Override
    void printDetails() {
        String details;
        details = "The purpose of this device is " +
                super.toString() +
                "This IPad has a case " +
                hasCase +
                " running on operating system version " +
                operatingSystemVersion;
        System.out.println(details);
    }

    /**
     * Compares this IPad with another object for equality.
     * Two IPads are equal if they have the same operating system version (case-insensitive).
     *
     * @param obj the object to compare with.
     * @return {@code true} if the objects are equal; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
        {
            return true;
        }
        if(obj == null || !(obj instanceof IPad))
        {
            return false;
        }
        IPad ipad = (IPad) obj;
        if(this.operatingSystemVersion.toLowerCase().equals(ipad.getOperatingSystemVersion().toLowerCase()))
        {
            return true;
        }
        return false;
    }

    /**
     * Returns the hash code for this IPad.
     * Based on the operating system version (case-insensitive).
     *
     * @return the hash code.
     */
    @Override
    public int hashCode() {
        return this.operatingSystemVersion.toLowerCase().hashCode();
    }

    /**
     * Returns a string representation of the IPad.
     *
     * @return a string describing the IPad.
     */
    @Override
    public String toString() {
        String details;
        details = "The purpose of this device is " +
                super.toString() +
                "This Ipad has a case " +
                hasCase +
                " and is running on operating system version " +
                operatingSystemVersion;
        return details;
    }

    /*
     * Validates the operating system version.
     *
     * @param operatingSystemVersion the operating system version to validate.
     * @throws IllegalArgumentException if {@code operatingSystemVersion} is null or empty.
     */
    private static void validateOperatingSystemVersion(final String operatingSystemVersion) {
        if (operatingSystemVersion == null || operatingSystemVersion.isEmpty()) {
            throw new IllegalArgumentException("Operating system version cannot be empty");
        }
    }
}
