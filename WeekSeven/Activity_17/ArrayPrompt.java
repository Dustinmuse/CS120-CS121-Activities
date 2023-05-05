package WeekSeven.Activity_17;

import javax.swing.*;

public class ArrayPrompt
{
    public static void main(String[] args)
    {
        StringArrayList students = new StringArrayList();
        int count = 1;
        while(true)
        {
            String studentNames = JOptionPane.showInputDialog("Please enter the name of student " + count + "\nPress q when finished entering the names of all students");
            if(studentNames.equals("q"))
            {
                break;
            }
            students.addName(studentNames);
            count++;
        }
        students.displayInfo();
    }
}
