package WeekThree.Activity_7;

import javax.swing.*;

public class WhileLoopActivity
{
    public static void main(String[] args)
    {
        // System.out.println("Press and enter q if you want to quit the game at anytime");
        String numberr = JOptionPane.showInputDialog("Press and enter q if you want to quit the game at anytime.\n Guess any number from 1-100 without decimals: ");
        numberr = numberr.toLowerCase();

        int randomm = (int) ((Math.random() * 100) + 1);
        int count = 0;

        //ADDED CODE
        while(!numberr.equals("q"))
        {
            //The .matches() method of the String class is used to check if the string matches the given regular expression pattern.
            // In this case, the pattern "\\d+" matches one or more consecutive digits.
            //The regular expression pattern is surrounded by double backslashes \\ to escape them,
            // because \d is a special character in Java that represents a digit.
            // If the string stored in numberr only contains digits, the condition numberr.matches("\\d+") will evaluate to true,
            // otherwise it will evaluate to false.
            if (numberr.matches("\\d+"))
            {

                // added this code here
                // when the number is extracted from the string it is then converted to an integer.
                int number = Integer.parseInt(numberr);

                //ORIGINAL CODE
                if (number < randomm)
                {
                    //changed number to numberr
                    numberr = JOptionPane.showInputDialog("Too low, Guess again: ");
                    count += 1;
                }
                else if (number > randomm)
                {
                    numberr = JOptionPane.showInputDialog("Too high, Guess again: ");
                    count += 1;
                }
                else if (number == randomm)
                {
                    count += 1;
                    System.out.println("Correct");
                    System.out.println("You guessed " + count + " times");
                    // added
                    break;
                }
                else
                {
                    numberr = JOptionPane.showInputDialog("Invalid input, please enter a number or q to quit:");

                }

            }
            // THIS IS TAKEN FROM YOUR CODE AND IS FROM THE ELSE IF STATEMENT.
            if (numberr.equals("q"))
            {
                System.out.println("Nice try, the number was " + randomm);
            }
        }
    }
}