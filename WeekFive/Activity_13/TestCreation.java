package WeekFive.Activity_13;

public class TestCreation
{
    public static void main(String[] args)
    {
        Creation worker = new Creation("John", 22387, true, "All Access");

        System.out.println(worker.getID());
        //System.out.println(worker.checkEmployeed());
        System.out.println(worker.getName());
        //System.out.println(worker.getScanner());

        //if the methods are public they still work but if the methods are private they don't work
    }
}
