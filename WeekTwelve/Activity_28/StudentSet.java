package WeekTwelve.Activity_28;

import javax.swing.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentSet
{
    //no duplicates
    //a treeSet sorts the array in ascending order automatically if you put the unsorted array in it
    Set<String> students = new HashSet<>();

    public void addStudents()
    {
        while(true)
        {
            String names = JOptionPane.showInputDialog("Enter students one by one until finished then enter q");
            if(names.equals("q"))
            {
                break;
            }
            students.add(names);
        }
    }
    public void displayStudents()
    {
        Iterator<String> hi = students.iterator();
        while(hi.hasNext())
        {
            String name = hi.next();
            System.out.print(name + " ");
        }
    }
}
