package WeekThree.Activity_8;

import javax.swing.*;

public class TestAverage
{
    public static void main(String[] args)
    {
        int students = Integer.parseInt(JOptionPane.showInputDialog("How many students are there: "));
        int tests = Integer.parseInt(JOptionPane.showInputDialog("How many tests are there per student: "));
        double average = 0;
        for(int s = 1; s <= students; s++)
        {
            for (int t = 1; t <= tests; t++)
            {
                int test1 = Integer.parseInt(JOptionPane.showInputDialog("Enter score of test " + t + " without decimals: "));
                average += test1;
            }
            average = average / tests;
            System.out.println("The average for student " + s + " is: " + average);
        }
    }
}
