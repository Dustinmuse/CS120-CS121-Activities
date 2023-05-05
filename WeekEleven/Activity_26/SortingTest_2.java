package WeekEleven.Activity_26;

public class SortingTest_2
{
    public static void main(String[] args)
    {
        Sorting_2 two = new Sorting_2();
        int[] array = two.getArray();
        System.out.print("Unsorted array: ");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Sorted array: ");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(two.setArray(array)[i] + " ");
        }
    }
}
