package WeekTwelve;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class TreeSett
{
    public static void main(String[] args)
    {
        Set<Integer> unorderedSet = new HashSet<>();

        int[] intArray = {28, 29, 29, 45, 60, 21, 4, 4, 15};

        System.out.println("Array:");

        for(int num: intArray)
        {
            System.out.printf("%d", num);
            unorderedSet.add(num);
        }

        System.out.println();

        System.out.println("Unordered Set:");

        for(int elem: unorderedSet)
        {
            System.out.printf("%d", elem);
        }

        System.out.println();

        System.out.printf("Array: %d\nSize: %d\n\n", intArray.length, unorderedSet.size());

        TreeSet<Integer> sortedArray = new TreeSet<>(unorderedSet);

        System.out.println("Sorted Set:");

        for(int elem: sortedArray)
        {
            System.out.printf("%d", elem);
        }
    }
}
