package WeekSix.Activity_16;

import javax.swing.*;

public class ArrayDemo3
{
    public static void main(String[] args)
    {
        String[][] names = new String[3][3];
        for (int k = 0; k < names.length; k++)
        {
            for (int l = 0; l < names[k].length; l++)
            {
                names[k][l] = JOptionPane.showInputDialog("Enter names for [" + k + "][" + l + "]: ");
            }
        }
        for (int k = 0; k < names.length; k++)
        {
            for (int l = 0; l < names[k].length; l++)
            {
                System.out.print(names[k][l] + " ");
            }
            System.out.println();
        }
    }
}
