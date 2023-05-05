package WeekSeven.Activity_17;

import java.util.ArrayList;

public class ArrayRunner
{
    public static void main(String[] args)
    {
        StringArrayList name = new StringArrayList();
        name.addName("Billy");
        name.addName("John");
        name.addName("Pepper");
        name.addName("Cayden");
        name.removeName("John");
        name.removeName("Pepper");
        name.getSize();
        name.getIndexOfName("Cayden");
        name.displayInfo();
    }
}
