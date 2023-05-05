package WeekTwo;

import javax.swing.*;

public class TestScores_Activity2
{
    public static void main(String[] args)
    {
        double test1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter a test score: "));
        double test2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter a different test score: "));
        double test3 = Double.parseDouble(JOptionPane.showInputDialog("Please enter a different test score: "));

        double average = (test1 + test2 + test3) / 3;

        char grade;

        if(average >= 90)
        {
            grade = 'A';
        }

        else if(average >= 80)
        {
            grade = 'B';
        }

        else if(average >= 70)
        {
            grade = 'C';
        }

        else if(average >= 60)
        {
            grade = 'D';
        }

        else
        {
            grade = 'F';
        }

        System.out.println("The average of your three test scores is " + average);
        System.out.println("Your grade is a: " + grade);
    }
}

