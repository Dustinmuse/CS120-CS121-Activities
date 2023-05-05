package WeekTen.Activity_23;

public class CharacterCount
{
    char[] words = {'a', 'b', 'c', 'd', 'e', 'e', 's', 'w', 'a', 'w', 'y', 'q'};
    int count = 0;
    int total = 0;
    public void getCharacterCount(char find)
    {
        if((words.length > count) && (words[count] == find))
        {
            total++;
            count++;
            getCharacterCount(find);
        }
        else if((words.length > count) && (words[count] != find))
        {
            count++;
            getCharacterCount(find);
        }
        else
        {
            System.out.println("The character " + find + " is shown " + total + " times");
        }
    }
}
