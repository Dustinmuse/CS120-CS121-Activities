package WeekTen.Activity_21;

public class StaticClass
{
    String name;
    double salary;
    int id;
    static int count = 0;
    public StaticClass(String name, double salary, int id)
    {
        this.name = name;
        this.salary = salary;
        this.id = id;
        count++;
    }

    public static int getCount()
    {
        return count;
    }
}
