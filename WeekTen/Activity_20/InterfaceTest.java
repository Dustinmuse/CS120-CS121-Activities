package WeekTen.Activity_20;

public class InterfaceTest
{
    public static void main(String[] args)
    {
        InterfaceSubClass1 one = new InterfaceSubClass1("Randal", 50000);
        InterfaceSubClass2 two = new InterfaceSubClass2("Cayden", 55217);

        System.out.println(one.getName());
        System.out.println(two.getName());
    }
}
