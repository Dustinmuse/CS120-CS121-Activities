package WeekFifteen.Activity_34;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TotalCalories
{
    private DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    public int totalCalorie(int calPerDay, String startDate, String endDate)
    {
        int days = 0;
        try
        {
            Date date1 = dateFormat.parse(startDate);
            Date date2 = dateFormat.parse(endDate);
            long difference = date2.getTime() - date1.getTime();
            days = (int) TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
        }
        catch(ParseException e)
        {
            e.printStackTrace();
        }
        return calPerDay * days;
    }
}
