package WeekThirteen.Activity_30;

import java.util.HashMap;

public class HashMapsDemo
{
    HashMap<String, Integer> namesAndIds  = new HashMap<>();

    public void addNamesAndIds(String name, int id)
    {
        namesAndIds.put(name, id);
    }

    public void removeNamesAndIds(String name, int id)
    {
        namesAndIds.remove(name, id);
    }

    public void getNamesAndIds(int index)
    {
        namesAndIds.get(index);
    }

    public void displayValue()
    {
            System.out.println(namesAndIds + " ");
    }
}
