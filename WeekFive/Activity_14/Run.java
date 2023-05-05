package WeekFive.Activity_14;

public class Run
{
    public static void main(String[] args)
    {
        Overload one = new Overload();
        Overload two = new Overload("Joe");
        Overload three = new Overload(false, "alien", "white", 148);

        System.out.println(one.getAge());
        System.out.println(one.getAge("over 18"));

        System.out.println(two.getAge());
        System.out.println(two.getAge("over 120"));

        System.out.println(three.getAge());
        System.out.println(three.getAge("over 148"));
    }
}
