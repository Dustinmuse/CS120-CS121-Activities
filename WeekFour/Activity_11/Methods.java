package WeekFour.Activity_11;

import java.util.Scanner;

public class Methods
{
    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args)
    {
        double l = getLength();
        double w = getWidth();
        double a = getArea(w, l);
        displayData(w, l, a);
        scan.close();
    }
    public static double getLength()
    {
        System.out.println("What is the length of the rectangle?");
        double length = scan.nextDouble();

        return length;
    }
    public static double getWidth()
    {
        System.out.println("What is the width of the rectangle?");
        double width = scan.nextDouble();

        return width;
    }
    public static double getArea(double w, double l)
    {
        double area = l * w;

        return area;
    }
    public static void displayData(double wi, double le, double ar)
    {
        System.out.println("The width of the rectangle is: " + wi);
        System.out.println("The length of the rectangle is: " + le);
        System.out.println("The area of the rectangle is: " + ar);
    }
}
