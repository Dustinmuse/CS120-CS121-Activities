package WeekFour.Activity_10;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File outputFile = new File("C:\\Users\\DJmus\\AppData\\Roaming\\JetBrains\\IdeaIC2022.3\\scratches\\course.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String course;
        String credits;
        String score;

        //writes a header for the file with spaces in between
        output.printf("%s %s %s\n", "couse", "credits", "score");

        for(int i = 1; i <= 3; i++)
        {
            course = JOptionPane.showInputDialog(String.format("Please enter name of couse %d: ", i));
            credits = JOptionPane.showInputDialog("Please enter the course credits: ");
            score = JOptionPane.showInputDialog("Please enter the course score: ");

            output.printf("%s %s %s\n", course, credits, score);
        }
        output.close();
    }
}
