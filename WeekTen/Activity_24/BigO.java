package WeekTen.Activity_24;

public class BigO
{
    public void printOnce(int n)
    {
        System.out.println(n);
    }
    public void printNTimes(int n)
    {
        for(int i = 1; i <= 50; i++)
        {
            System.out.println(n);
        }
    }
    public void printNSquaredTimes(int n)
    {
        for(int i = 1; i <= 50; i++)
        {
            for(int j = 1; j <= 50; j++)
            {
                System.out.println(n);
            }
        }
    }
}
