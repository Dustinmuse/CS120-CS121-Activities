package WeekFive.Activity_13;

public class Creation
{
    public String name;
    public int id;
    private boolean employeed;
    private String scanner;

    public Creation(String n, int i, boolean employ, String scan)
    {
        name = n;
        id = i;
        employeed = employ;
        scanner = scan;
    }
    public int getID()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    private boolean checkEmployeed()
    {
        return employeed;
    }
    private String getScanner()
    {
        return scanner;
    }
}
