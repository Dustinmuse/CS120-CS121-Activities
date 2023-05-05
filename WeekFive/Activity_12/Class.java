package WeekFive.Activity_12;

public class Class
{
    double width;
    double length;
    double height;
    public Class()
    {
        width = 36.31;
        length = 21.56;
        height = 98.25;
    }
    public void getArea()
    {
        double area = width * length;
        System.out.println("Area: " + area);
    }
}
