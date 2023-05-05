package WeekThirteen.Activity_30;

import java.util.HashMap;

public class HashMapsMain
{
    public static void main(String[] args)
    {
        HashMapsDemo one = new HashMapsDemo();
        one.addNamesAndIds("Billy", 42665);
        one.addNamesAndIds("John", 11982);
        one.addNamesAndIds("Cayden", 70327);
        one.displayValue();
        one.removeNamesAndIds("John", 11982);
        one.displayValue();
    }
}
