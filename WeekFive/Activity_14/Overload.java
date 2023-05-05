package WeekFive.Activity_14;

public class Overload
{
    boolean human;
    String name;
    String colorHair;
    int age;

    public Overload()
    {
        human = true;
        name = "Cayden";
        colorHair = "brown";
        age = 22;
    }
    public Overload(String n)
    {
        human = true;
        name = n;
        colorHair = "brown";
        age = 22;
    }
    public Overload(boolean h, String n, String c, int a)
    {
        human = h;
        name = n;
        colorHair = c;
        age = a;
    }
    public boolean getHuman()
    {
        return human;
    }
    public String getName()
    {
        return name;
    }
    public String getHair()
    {
        return colorHair;
    }
    public int getAge()
    {
        return age;
    }
    public int getAge(String g)
    {
        if(g.equalsIgnoreCase("over " + age))
        {
            System.out.println("you are over " + age);
        }
        else
        {
            System.out.println("you are not over " + age);
        }
        return age;
    }
    public void setHuman(boolean h)
    {
        human = h;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setHair(String h)
    {
        colorHair = h;
    }
    public void setAge(int a)
    {
        age = a;
    }
}
