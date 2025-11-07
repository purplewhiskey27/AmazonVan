public class AmazonVan {
    
    private String licensePlate;
    private double charge;
    private int numPackages;
    private Driver driver;
    private boolean delivering;
    private String vanName;
    
    //constructor
    public AmazonVan(String licensePlate, double charge, int numPackages, Driver inputDriver, boolean delivering, String vanName)
    {
        this.licensePlate = licensePlate;
        this.charge = charge;
        this.numPackages = numPackages;
        driver = new Driver(inputDriver.getName(), inputDriver.getTiredLevel());
        this.delivering = delivering;
        this.vanName = vanName;
    }

    //constructor
    public AmazonVan(double charge, int numPackages, boolean delivering)
    {
        licensePlate = "COMPSCI";
        this.charge = charge;
        this.numPackages = numPackages;
        this.delivering = delivering;
        vanName = "Julia";
        driver = new Driver();

    }

    //getter
    public String getPlate()
    {
        return licensePlate;
    }

    //setter
    public void newPlates(String newPlate)
    {
        licensePlate = newPlate;
    }

    //getter
    public double getCharge()
    {
        return charge;
    }

    //setter
    public void setCharge(double charge)
    {
        this.charge = charge;
    }

    //behavior
    public void chargeUp()
    {
        charge = 100.00;
    }

    //getter
    public int getNumPackages()
    {
        return numPackages;
    }

    //setter
    public void pickUpPackages(int numPackages)
    {
        numPackages += numPackages;
    }

    //getter
    public Driver getDriver()
    {
        return driver;
    }

    //behavior
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

    //getter
    public boolean isDelivering()
    {
        return delivering;
    }

    //behavior
    public void deliver()
    {
        delivering = true;
        numPackages --;
        charge -= 10.00;

    }

    //getter
    public String getVanName()
    {
        return vanName;
    }

    //setter
    public void changeVanName(String newVanName)
    {
        vanName = newVanName;
    }

    
        
    public String toString()
    {
        
        return "License Plate Number: " + licensePlate + "\nCharge Level: " + charge + "\nNumber of Packages: " + numPackages + "\n"+ driver + "\nDelivering? " + delivering +  "\nVan name: " + vanName;
        
    }

}
