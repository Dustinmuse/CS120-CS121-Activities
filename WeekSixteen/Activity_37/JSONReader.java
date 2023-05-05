package WeekSixteen.Activity_37;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JSONReader
{
    public static void main(String[] args)
    {
        try
        {
            //Creates a Gson object
            Gson gson = new Gson();

            // reading the json file with BufferedReader class object
            //Reads text from a character-input stream, buffering characters.
            // Provides for the efficient reading of characters, arrays, and lines.

            BufferedReader reader = new BufferedReader(new FileReader("employee.json"));

            // converts json to Java object
            Employee employee = gson.fromJson(reader,Employee.class);
            System.out.println("****** Employee Details ******");
            System.out.printf("Employee name %s\nEmployee id: %d\nEmployee department: %s",employee.getName(),employee.getId(),employee.getDepartment());

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
