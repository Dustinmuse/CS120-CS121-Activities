package WeekEleven.Activity_26;

import javax.swing.*;

public class Sorting_2
{
    public int[] getArray()
    {
        int intOne = Integer.parseInt(JOptionPane.showInputDialog("Please enter a random number"));
        int intTwo = Integer.parseInt(JOptionPane.showInputDialog("Please enter a random number"));
        int intThree = Integer.parseInt(JOptionPane.showInputDialog("Please enter a random number"));
        int intFour = Integer.parseInt(JOptionPane.showInputDialog("Please enter a random number"));
        int intFive = Integer.parseInt(JOptionPane.showInputDialog("Please enter a random number"));
        int[] unsorted = {intOne, intTwo, intThree, intFour, intFive};

        return unsorted;
    }
    public int[] setArray(int[] array)
    {

        //ORIGINAL CODE
        //for(int i = 0; i < array.length; i++)
        //CORRECTED CODE
        // The outer loop iterates through the array elements, except for the last one
        for(int i = 0; i < array.length - 1; i++)
        {
            //kept
            int min = array[i];
            //added to store the minimum index
            int minIndex =i;

            // ORIGINAL CODE
            // for(int j = i + 1; j < array.length - i; j++)
            // CORRECTED CODE
            // Remove the i
            for(int j = i + 1; j < array.length ; j++)
            {
                //ORIGINAL CODE:
                // if (array[j - 1] < array[j] && array[j - 1] < min)
                // THE CONDITION ABOVE WAS NOT NECESSARY TO FINDING THE MINIMUM VALUE
                // the value at array[j] will be assigned to min and j will be assigned to the minimum index
                //CORRECTED CODE
                if (array[j] < min)
                {
                    min = array[j];
                    minIndex = j;
                }
            }
            // The inner loop iterates
            // through the rest of the array to find the minimum value and updates the min and minIndex
            // variables if a smaller value is found.
            //CORRECTED CODE
            if (minIndex != i)
            {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;

            }
        }
        return array;
    }
}