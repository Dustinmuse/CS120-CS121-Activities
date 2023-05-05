package WeekTen.Activity_20;

public class InterfaceSubClass2 implements InterfaceClasses
{
    int id;
    String name;
    public InterfaceSubClass2(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString()
    {
        return super.toString() + " id: " + id;
    }
    public String getName()
    {
        return name;
    }
}
