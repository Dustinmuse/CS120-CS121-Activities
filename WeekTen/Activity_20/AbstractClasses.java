package WeekTen.Activity_20;

public abstract class AbstractClasses
{
    String name;
    public AbstractClasses(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "name: " + name;
    }
    public abstract String getName();
}
