package WeekTwo;

import javax.swing.*;

public class EvenOrOdd_Activity3
{
    public static void main(String[] args)
    {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Please enter any number without decimals: "));

        String evenOrOdd;

        if(number % 2 == 0)
        {
            evenOrOdd = "Even";
        }
        else
        {
            evenOrOdd = "Odd";
        }

        System.out.println(evenOrOdd);
    }
}
