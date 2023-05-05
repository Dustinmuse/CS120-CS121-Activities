import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO
{
    public static void main(String[] args)
    {

        File imputFile = new File("C:\\Users\\DJmus\\AppData\\Roaming\\JetBrains\\IdeaIC2022.3\\scratches\\course.txt");
        //reading the file also with an exception encase it's not right
        try
        {
            Scanner input = new Scanner(imputFile);

            while(input.hasNextLine())
            {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }

        //you can also use catch in this way too (the message will be in red)
        //catch(FileNotFoundException e)
        //{
        //System.err.println("File Not Found");
        //}
    }
}
