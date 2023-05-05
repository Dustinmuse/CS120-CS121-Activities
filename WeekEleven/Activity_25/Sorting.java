package WeekEleven.Activity_25;

import javax.swing.*;

public class Sorting
{
    public int[] getArray()
    {
        int  intOne = Integer.parseInt(JOptionPane.showInputDialog("Please enter a random number"));
        int intTwo = Integer.parseInt(JOptionPane.showInputDialog("Please enter a random number"));
        int intThree = Integer.parseInt(JOptionPane.showInputDialog("Please enter a random number"));
        int intFour = Integer.parseInt(JOptionPane.showInputDialog("Please enter a random number"));
        int intFive = Integer.parseInt(JOptionPane.showInputDialog("Please enter a random number"));
        int[] unsorted = {intOne, intTwo, intThree, intFour, intFive};

        return unsorted;
    }
    public int[] setArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length - i - 1; j++)
            {
                if(array[j] > array[j + 1])
                {
                    int original = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = original;
                }
            }
        }
        return array;
    }
}
