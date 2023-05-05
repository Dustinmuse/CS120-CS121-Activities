package WeekTen.Activity_20;

public class AbstractTest
{
    public static void main(String[] args)
    {
        AbstractSubClass1 two = new AbstractSubClass1("Joe", 100000.00);
        AbstractSubClass2 three = new AbstractSubClass2("Hannah", 32878);

        System.out.println(two.getName());
        System.out.println(three.getName());
    }
}
