package WeekSix.Activity_15;

import javax.swing.*;

public class ArrayFromInput
{
    public static void main(String[] args)
    {
        int[] scores = new int[3];
        String[] names = new String[3];
        int[] id = new int[3];
        int count = 1;

        for(int i = 0; i < names.length; i++)
        {
            names[i] = JOptionPane.showInputDialog("Please enter the name of student " + count + ":");
            scores[i] = Integer.parseInt(JOptionPane.showInputDialog("Please enter the test scores of student " + count + ":"));
            id[i] = Integer.parseInt(JOptionPane.showInputDialog("Please enter the id of student " + count + ":"));
            count++;
        }
        System.out.printf("%-8s %-8s %s\n", "Name", "Score", "ID");

        for(int i = 0; i < names.length; i++)
        {
            System.out.printf("%-8s %-8d %d\n", names[i], scores[i], id[i]);
        }
    }
}