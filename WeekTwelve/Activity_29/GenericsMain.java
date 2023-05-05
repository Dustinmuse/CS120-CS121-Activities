package WeekTwelve.Activity_29;

import WeekSeven.Activity_17.StringArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericsMain
{
    public static void main(String[] args)
    {
        GenericMethods generic = new GenericMethods();
        //Integer[] intArrayList = {1, 2, 3, 4, 5};
        //Double[] doubleArrayList = {1.1, 2.2, 3.3, 4.4, 5.5};
        //Character[] charArrayList = {'A', 'B', 'C', 'D', 'E'};
        //String[] stringArrayList = {"Alpha", "Beta", "Gamma", "Delta", "Epsilon"};

        ArrayList<Integer> intArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Double> doubleArrayList = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
        ArrayList<Character> charArrayList = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon"));

        System.out.print("Integer arraylist: ");
        generic.printArrayList(intArrayList);

        System.out.print("Double arraylist: ");
        generic.printArrayList(doubleArrayList);

        System.out.print("Char arraylist: ");
        generic.printArrayList(charArrayList);

        System.out.print("String arraylist: ");
        generic.printArrayList(stringArrayList);
    }
}
