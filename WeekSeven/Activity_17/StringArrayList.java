package WeekSeven.Activity_17;

import java.util.ArrayList;

public class StringArrayList
{
    private ArrayList <String> names = new ArrayList<>();
    public void displayInfo()
    {
        System.out.printf("Names:%n");
        for (int i = 0; i < names.size(); i++)
        {
            System.out.printf("%s%n", names.get(i));
        }
    }
    public void addName(String n)
    {
        names.add(n);
    }
    public void removeName(String m)
    {
        names.remove(m);
    }
    public int getSize()
    {
        return names.size();
    }
    public int getIndexOfName(String i)
    {
        return names.indexOf(i);
    }
}
