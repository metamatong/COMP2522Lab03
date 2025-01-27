package ca.bcit.comp2522.lab3;

public abstract class IDevice {

    private final String purpose;

    IDevice(final String purpose) {
        validatePurpose(purpose);
        this.purpose = purpose;
    }

    private final String getPurpose()
    {
        return this.purpose;
    }

    abstract void printDetails();

    @Override
    public abstract String toString();

    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract int hashCode();

    private static void validatePurpose(final String purpose) {

        final boolean emptyString;

        emptyString = purpose == null || purpose.isBlank();

        if (emptyString)
        {
            throw new IllegalArgumentException("purpose cannot be null or empty");
        }
    }
}
