package WeekFifteen.Activity_35;

import WeekFourteen.Activity_33.LinkedListQueue;

public class Room
{
    private String name;
    private String content = "";

    public Room(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public boolean checkContents()
    {
        if(this.content.isEmpty())
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public String getContent()
    {
        return content;
    }
}
