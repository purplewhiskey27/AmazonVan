/**
 * Represents an Amazon delivery van with a license plate, charge level,
 * current number of packages, assigned driver, delivery state, and a name.
 * 
 * This class provides basic behaviors such as charging the van, delivering a
 * package (which decreases the package count and charge), and taking a break
 * to reduce the driver's tiredness.
 * 
 * @author Violet Waskey
 * @collaborator GitHub Copilot for javadoc comments
 */
public class AmazonVan {
    
    /** The license plate identifier for the van. */
    private String licensePlate;

    /** Current battery/charge level (0-100). */
    private double charge;

    /** Number of packages currently onboard. */
    private int numPackages;

    /** Assigned driver for this van. */
    private Driver driver;

    /** Whether the van is currently delivering. */
    private boolean delivering;

    /** A human-readable name for the van. */
    private String vanName;
    
    /**
     * Creates a new AmazonVan with the given properties.
     *
     * @param licensePlate the van's license plate
     * @param charge initial charge level (0-100)
     * @param numPackages initial number of packages onboard
     * @param inputDriver a Driver object to associate with the van; a copy of the driver's name and tired level is stored
     * @param delivering whether the van is currently delivering
     * @param vanName a human-readable name for the van
     */
    public AmazonVan(String licensePlate, double charge, int numPackages, Driver inputDriver, boolean delivering, String vanName)
    {
        this.licensePlate = licensePlate;
        this.charge = charge;
        this.numPackages = numPackages;
        driver = new Driver(inputDriver.getName(), inputDriver.getTiredLevel());
        this.delivering = delivering;
        this.vanName = vanName;
    }

    /**
     * Convenience constructor that creates a van with default license plate
     * and driver, but with the provided charge, package count, and delivery
     * state.
     *
     * @param charge initial charge level
     * @param numPackages initial number of packages
     * @param delivering whether the van is currently delivering
     */
    public AmazonVan(double charge, int numPackages, boolean delivering)
    {
        licensePlate = "COMPSCI";
        this.charge = charge;
        this.numPackages = numPackages;
        this.delivering = delivering;
        vanName = "Julia";
        driver = new Driver();

    }

    /**
     * Returns the license plate identifier for this van.
     *
     * @return license plate string
     */
    public String getPlate()
    {
        return licensePlate;
    }

    /**
     * Updates the van's license plate.
     *
     * @param newPlate new license plate value
     */
    public void newPlates(String newPlate)
    {
        licensePlate = newPlate;
    }

    /**
     * Returns the current charge level of the van.
     *
     * @return charge level (numeric)
     */
    public double getCharge()
    {
        return charge;
    }

    /**
     * Sets the van's charge level.
     *
     * @param charge new charge level
     */
    public void setCharge(double charge)
    {
        this.charge = charge;
    }

    /**
     * Fully charges the van to 100%.
     */
    public void chargeUp()
    {
        charge = 100.00;
    }

    /**
     * Returns the number of packages currently onboard.
     *
     * @return number of packages
     */
    public int getNumPackages()
    {
        return numPackages;
    }

    /**
     * Picks up additional packages and adds them to the current count.
     *
     * @param numPackages number of packages to add
     */
    public void pickUpPackages(int numPackages)
    {
        this.numPackages += numPackages;
    }

    /**
     * Returns the Driver assigned to this van.
     *
     * @return the assigned Driver
     */
    public Driver getDriver()
    {
        return driver;
    }

    /**
     * Reduce the driver's tiredness based on a break length. If the driver's
     * tired level would go below zero it is set to zero.
     *
     * @param breakLength length of the break in the same units as tired level
     */
    public void breakDuration(int breakLength)
    {
        if (driver.getTiredLevel() <= (breakLength/2))
        {
         driver.changeTiredLevel(0);
        }
        else
        {
         driver.changeTiredLevel(driver.getTiredLevel() - breakLength/2);
        }
        
    }

    /**
     * Returns true when the van is actively delivering.
     *
     * @return delivering state
     */
    public boolean isDelivering()
    {
        return delivering;
    }

    /**
     * Marks the van as delivering, reduces the package count by one, and
     * reduces the charge by a fixed amount to simulate the delivery.
     */
    public void deliver()
    {
        delivering = true;
        numPackages --;
        charge -= 10.00;

    }

    /**
     * Returns the name of the van.
     *
     * @return van name
     */
    public String getVanName()
    {
        return vanName;
    }

    /**
     * Changes the human-readable name of the van.
     *
     * @param newVanName new name to set
     */
    public void changeVanName(String newVanName)
    {
        vanName = newVanName;
    }

        
    /**
     * Returns a multi-line string describing the van and its driver.
     *
     * @return textual representation of the van
     */
    public String toString()
    {
        
        return "License Plate Number: " + licensePlate + "\nCharge Level: " + charge + "\nNumber of Packages: " + numPackages + "\n"+ driver + "\nDelivering? " + delivering +  "\nVan name: " + vanName;
        
    }

}
