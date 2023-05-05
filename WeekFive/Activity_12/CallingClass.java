package WeekFive.Activity_12;

public class CallingClass
{
    public static void main(String[] args)
    {
        talk student = new talk("Billy", 63002, "Computer Science", 3.68);

        student.getInfo();

        System.out.println();

        Class rectangle = new Class();

        rectangle.getArea();
    }
}
