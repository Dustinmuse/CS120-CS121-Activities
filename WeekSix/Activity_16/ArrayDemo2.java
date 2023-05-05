package WeekSix.Activity_16;

import javax.swing.*;

public class ArrayDemo2
{
    public static void main(String[] args)
    {

        int[][][][] scores = new int[3][3][3][3];

        for (int i = 0; i < scores.length; i++)
        {
            for (int j = 0; j < scores[i].length; j++)
            {
                for (int k = 0; k < scores[i][j].length; k++)
                {
                    for (int l = 0; l < scores[i][j][k].length; l++)
                    {
                        scores[i][j][k][l] = Integer.parseInt(JOptionPane.showInputDialog("Enter score for [" + i + "][" + j + "][" + k + "][" + l + "]: "));
                    }
                }
            }
        }
        for (int i = 0; i < scores.length; i++)
        {
            for (int j = 0; j < scores[i].length; j++)
            {
                for (int k = 0; k < scores[i][j].length; k++)
                {
                    for (int l = 0; l < scores[i][j][k].length; l++)
                    {
                        System.out.print(scores[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
