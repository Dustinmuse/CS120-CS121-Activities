package WeekSixteen.Activity_37;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class JSONWriter
{
    public static void main(String[] args)
    {
        try
        {
            Employee employee = new Employee("Jennifer Ghirardelli", 528285, "Math");

            Gson gson = new Gson();

            // convert Java object to json
            String jsonString = gson.toJson(employee);

            // write Json string to file
            FileWriter filewriter = new FileWriter("employeeWritingStuff.json");
            filewriter.write(jsonString);
            filewriter.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
