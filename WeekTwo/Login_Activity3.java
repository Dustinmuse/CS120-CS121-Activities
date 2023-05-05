package WeekTwo;

import javax.swing.*;

public class Login_Activity3
{
    public static void main(String[] args)
    {
        String trueUsername = "12345";
        String truePassword = "play123";
        String userName = JOptionPane.showInputDialog("Please enter your username: ");
        String password = JOptionPane.showInputDialog("Please enter your password: ");

        if(userName.equals(trueUsername) == true && password.equals(truePassword) == true)
        {
            System.out.println("Welcome to CS121");
        }
        else if(userName.equals(trueUsername) == false && password.equals(truePassword) == true)
        {
            System.out.println("The username was incorrect");
        }
        else if(userName.equals(trueUsername) == true && password.equals(truePassword) == false)
        {
            System.out.println("The password was incorrect");
        }
        else
        {
            System.out.println("The username and password was incorrect");
        }
    }
}
