package WeekTen.Activity_20;

public class AbstractSubClass1 extends AbstractClasses
{
    double salary;
    public AbstractSubClass1(String name, double salary)
    {
        super(name);
        this.salary = salary;
    }
    @Override
    public String toString()
    {
        return super.toString() + " salary: " + salary;
    }

    @Override
    public String getName()
    {
        return name;
    }
}
