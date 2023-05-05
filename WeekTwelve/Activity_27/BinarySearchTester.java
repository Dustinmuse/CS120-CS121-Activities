package WeekTwelve.Activity_27;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearchTester
{
    public static void main(String[] args)
    {
        BinarySearchDemo demo = new BinarySearchDemo();
        //int[] array = {23, 17, 12, 90, 84, 38, 5, 77, 44};
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(23, 17, 12, 90, 84, 38, 5, 77, 44));
        System.out.printf("Unsorted: ");
        for(int num: array)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        ArrayList<Integer> sortedArray = selectionSort(array);
        System.out.print("Sorted: ");
        for(int num: sortedArray)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        int key = Integer.parseInt(JOptionPane.showInputDialog("What number would you like to search for?"));
        int found = demo.binarySearch(key, sortedArray);

        if(found == -1)
        {
            System.out.println("Item not found.");
        }
        else
        {
            System.out.printf("Item found at index %d, position %d", found, found + 1);
        }
    }
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> unsortedArray)
    {
        ArrayList<Integer> sortedArray = unsortedArray;
        for(int i = 0; i < sortedArray.size() - 1; i++)
        {
            int min = i;
            for(int j = i + 1; j < sortedArray.size(); j++)
            {
                if(sortedArray.get(j) < sortedArray.get(min))
                {
                    min = j;
                }
            }
            int temp = sortedArray.get(i);
            sortedArray.set(i, sortedArray.get(min));
            sortedArray.set(min, temp);
        }
        return sortedArray;
    }
}
