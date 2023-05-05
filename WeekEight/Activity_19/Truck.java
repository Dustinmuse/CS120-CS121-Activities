package WeekEight.Activity_19;

public class Truck extends Vehicle
{
    private int numTires;

    public Truck(String make, String model, int year, int numTires)
    {
        super(make, model, year);
        this.numTires = numTires;
    }

    public int getNumTires()
    {
        return numTires;
    }

    public void setNumTires(int numTires)
    {
        this.numTires = numTires;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Total tires: " + numTires;
    }
}
