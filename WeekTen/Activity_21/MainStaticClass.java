package WeekTen.Activity_21;

public class MainStaticClass
{
    public static void main(String[] args)
    {
        StaticClass one = new StaticClass("Holly", 68000, 54118);
        System.out.println(one.getCount());

        StaticClass two = new StaticClass("Jiles", 35000, 77215);
        System.out.println(two.getCount());
    }
}
