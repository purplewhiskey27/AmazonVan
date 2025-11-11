
/**
 * Simple model of a driver assigned to an AmazonVan.
 *
 * Stores a name and a tiredness level. The tiredness level is a numeric
 * value (the code treats it as a 0-10 scale in output but values are not
 * strictly enforced).
 * 
 * @author Violet Waskey
 * @collaborator GitHub Copilot for javadoc comments
 */

public class Driver
{
    /** Numeric tiredness level for the driver. */
    private double tiredLevel;

    /** Driver's name. */
    private String name;

    /**
     * Constructs a Driver with the provided name and tiredness level.
     *
     * @param name driver's name
     * @param tiredLevel initial tiredness level
     */
    public Driver(String name, double tiredLevel)
    {
        this.tiredLevel = tiredLevel;
        this.name = name;
    }

    /**
     * Constructs a Driver with default values: name "John" and tiredLevel 1.
     */
    public Driver()
    {
        name = "John";
        tiredLevel = 1;
    }

    /**
     * Returns the driver's name.
     *
     * @return name string
     */
    public String getName()
    {
        return name;
    }

    /**
     * Changes the driver's name.
     *
     * @param newName new name for the driver
     */
    public void changeName(String newName)
    {
        name = newName;
    }

    /**
     * Returns the current tiredness level.
     *
     * @return tiredness level
     */
    public double getTiredLevel()
    {
        return tiredLevel;
    }

    /**
     * Sets the driver's tiredness to the provided value.
     *
     * @param tiredLevel new tiredness level
     */
    public void changeTiredLevel(double tiredLevel)
    {
        this.tiredLevel = tiredLevel;
    }

    /**
     * Returns a textual representation of the Driver including name and
     * tiredness.
     *
     * @return descriptive string
     */
    public String toString()
    {
        return "Driver Name: " + name + "\nTiredness Level (0-10): " + tiredLevel;

    }

}