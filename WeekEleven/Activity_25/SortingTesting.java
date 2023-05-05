package WeekEleven.Activity_25;

public class SortingTesting
{
    public static void main(String[] args)
    {
        Sorting one = new Sorting();
        int[] array = one.getArray();
        System.out.print("Unsorted array: ");
        for(int i =0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Sorted array: ");
        for(int i =0; i < array.length; i++)
        {
            System.out.print(one.setArray(array)[i] + " ");
        }
    }
}
