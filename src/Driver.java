
public class Driver
{
    private double tiredLevel;
    private String name;

    public Driver(String name, double tiredLevel)
    {
        this.tiredLevel = tiredLevel;
        this.name = name;
    }

    public Driver()
    {
        name = "John";
        tiredLevel = 1;
    }

    public String getName()
    {
        return name;
    }

    public void changeName(String newName)
    {
        name = newName;
    }

    public double getTiredLevel()
    {
        return tiredLevel;
    }

    public void changeTiredLevel(double tiredLevel)
    {
        this.tiredLevel = tiredLevel;
    }

    
    

    public String toString()
    {
        return "Driver Name: " + name + "\nTiredness Level (0-10): " + tiredLevel;

    }

}