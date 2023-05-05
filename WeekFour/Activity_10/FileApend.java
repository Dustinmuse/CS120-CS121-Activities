package WeekFour.Activity_10;

import javax.swing.*;
import java.io.*;

public class FileApend
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            FileWriter fileWriter = new FileWriter("C:\\Users\\DJmus\\AppData\\Roaming\\JetBrains\\IdeaIC2022.3\\scratches\\course.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);

            String course = JOptionPane.showInputDialog("Please enter name of course : ");
            String credits = JOptionPane.showInputDialog("Please enter the course credits: ");
            String score = JOptionPane.showInputDialog("Please enter the course score: ");

            output.printf("%s %s %s\n", course, credits, score);
            fileWriter.close();
            output.close();
        }
        catch(FileNotFoundException e)
        {
            System.err.println("File not found");
        }
    }
}
