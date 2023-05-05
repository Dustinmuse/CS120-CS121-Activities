package WeekTwo;

import javax.swing.*;

public class BookClubPoints_Activity2
{
    public static void main(String[] args)
    {
        int points = 0;
        int booksBought = Integer.parseInt(JOptionPane.showInputDialog("Please enter how many you have bought this month: "));

        if(booksBought >= 4)
        {
            points = 60;
        }

        else if(booksBought == 3)
        {
            points = 30;
        }

        else if(booksBought == 2)
        {
            points = 15;
        }

        else if(booksBought == 1)
        {
            points = 5;
        }

        System.out.println("You have been awarded this many points: " + points);
    }
}
