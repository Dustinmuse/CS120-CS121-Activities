package WeekTwo;

import javax.swing.*;

public class Triangles_Activity3
{
    public static void main(String[] args)
    {
        double side1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of one of the sides of the triangle: "));
        double side2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of a different side of the triangle: "));
        double side3 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the last side of the triangle: "));

        if(side1 == side2  && side2 == side3)
        {
            System.out.println("You have a equilateral triangle");
        }
        else if(side1 != side2 && side1 != side3 && side2 != side3)
        {
            System.out.println("You have a Scalene triangle");
        }
        else if(side1 == side2 || side2 == side3 || side1 == side3)
        {
            System.out.println("You have a Isosceles triangle");
        }
    }
}
