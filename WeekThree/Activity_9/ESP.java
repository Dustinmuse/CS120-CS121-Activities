package WeekThree.Activity_9;

import javax.swing.*;
import java.util.Random;

public class ESP
{
    public static void main(String[]args)
    {
        int correct = 0;
        for(int i = 1; i <= 10; i++)
        {
            Random random = new Random();
            int randomInt = random.nextInt(5);
            if(randomInt == 0)
            {
                String color = "red";
                String guess = JOptionPane.showInputDialog("Your options are: red, green, blue, orange, and yellow\nWhat color do you think was chosen: ");
                if(guess.toLowerCase().equals(color))
                {
                    System.out.println("You guessed the correct color");
                    correct += 1;
                }
                else
                {
                    System.out.println("The correct color was: " + color);
                }
            }
            if(randomInt == 1)
            {
                String color = "green";
                String guess = JOptionPane.showInputDialog("Your options are: red, green, blue, orange, and yellow\nWhat color do you think was chosen: ");
                if(guess.toLowerCase().equals(color))
                {
                    System.out.println("You guessed the correct color");
                    correct += 1;
                }
                else
                {
                    System.out.println("The correct color was: " + color);
                }
            }
            if(randomInt == 2)
            {
                String color = "blue";
                String guess = JOptionPane.showInputDialog("Your options are: red, green, blue, orange, and yellow\nWhat color do you think was chosen: ");
                if(guess.toLowerCase().equals(color))
                {
                    System.out.println("You guessed the correct color");
                    correct += 1;
                }
                else
                {
                    System.out.println("The correct color was: " + color);
                }
            }
            if(randomInt == 3)
            {
                String color = "orange";
                String guess = JOptionPane.showInputDialog("Your options are: red, green, blue, orange, and yellow\nWhat color do you think was chosen: ");
                if(guess.toLowerCase().equals(color))
                {
                    System.out.println("You guessed the correct color");
                    correct += 1;
                }
                else
                {
                    System.out.println("The correct color was: " + color);
                }
            }
            if(randomInt == 4)
            {
                String color = "yellow";
                String guess = JOptionPane.showInputDialog("Your options are: red, green, blue, orange, and yellow\nWhat color do you think was chosen: ");
                if(guess.toLowerCase().equals(color))
                {
                    System.out.println("You guessed the correct color");
                    correct += 1;
                }
                else
                {
                    System.out.println("The correct color was: " + color);
                }
            }
        }
        System.out.println("You got " + correct + " out of 10 correct");
    }
}
