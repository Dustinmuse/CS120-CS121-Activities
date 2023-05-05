package WeekTwo;

//allows for the use of the dialog box
import javax.swing.*;

//allows for pow, sqrt, log, etc. to be used
import static java.lang.Math.*;

public class Activity1
{
    public static void main(String[] args)
    {
        String fullName = JOptionPane.showInputDialog("Please enter you first and last name: ");

        System.out.println(fullName.toUpperCase());

        System.out.println(fullName.toLowerCase());

        String reverse = "";
        for(int i = fullName.length() - 1; i >= 0; i--)
        {
            reverse = reverse + fullName.charAt(i);
        }

        System.out.println(reverse);

        System.out.println();

        double firstNumber = Double.parseDouble(JOptionPane.showInputDialog("Please enter any number you want: "));

        double secondNumber = Double.parseDouble(JOptionPane.showInputDialog("Please enter any number you want: "));

        double add = firstNumber + secondNumber;
        double subtract = firstNumber - secondNumber;
        double divide = firstNumber / secondNumber;
        double multiply = firstNumber * secondNumber;
        double squareRootFirst = sqrt(firstNumber);
        double squareRootSecond = sqrt(secondNumber);
        double powerFirst = pow(firstNumber, secondNumber);
        double powerSecond = pow(secondNumber, firstNumber);
        double logFirst = log(firstNumber);
        double logSecond = log(secondNumber);

        System.out.println("Your first number was: " + firstNumber);
        System.out.println("Your second number was: " + secondNumber);
        System.out.println("Addition of the two numbers: " + add);
        System.out.println("Subtraction of the two numbers: " + subtract);
        System.out.println("Division of the two numbers: " + divide);
        System.out.println("Multiplication of the two numbers: " + multiply);
        System.out.println("The square root of the first number: " + squareRootFirst);
        System.out.println("The square root of the second number: " + squareRootSecond);
        System.out.println("The power of the first number: " + powerFirst);
        System.out.println("The power of the second number: " + powerSecond);
        System.out.println("The log of the first number: " + logFirst);
        System.out.println("The log of the second number: " + logSecond);
    }
}
