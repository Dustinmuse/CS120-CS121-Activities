package WeekSix.Activity_16;

import javax.swing.*;

public class ArrayDemo1
{
    public static void main(String[] args)
    {
        int[][][][] id = new int[3][3][3][3];

        for (int i = 0; i < id.length; i++)
        {
            for (int j = 0; j < id[i].length; j++)
            {
                for (int k = 0; k < id[i][j].length; k++)
                {
                    for (int l = 0; l < id[i][j][k].length; l++)
                    {
                        id[i][j][k][l] = Integer.parseInt(JOptionPane.showInputDialog("Enter score for [" + i + "][" + j + "][" + k + "][" + l + "]: "));
                    }
                }
            }
        }
        for (int i = 0; i < id.length; i++)
        {
            for (int j = 0; j < id[i].length; j++)
            {
                for (int k = 0; k < id[i][j].length; k++)
                {
                    for (int l = 0; l < id[i][j][k].length; l++)
                    {
                        System.out.print(id[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}