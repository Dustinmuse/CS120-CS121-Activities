package WeekTwelve.Activity_29;

import java.util.ArrayList;

public class GenericMethods
{
    public <E> void printArrayList(ArrayList<E> inputArrayList)
    {
        for(E element: inputArrayList)
        {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
