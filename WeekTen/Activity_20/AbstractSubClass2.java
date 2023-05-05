package WeekTen.Activity_20;

public class AbstractSubClass2 extends AbstractClasses
{
    int id;
    public AbstractSubClass2(String name, int id)
    {
        super(name);
        this.id = id;
    }
    @Override
    public String toString()
    {
        return super.toString() + " id: " + id;
    }

    @Override
    public String getName()
    {
        return name;
    }
}
