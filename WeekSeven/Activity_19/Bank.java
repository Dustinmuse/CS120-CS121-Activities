package WeekSeven.Activity_19;

import javax.swing.*;

public class Bank
{
    public static void main(String[] args)
    {
        String accountOrNot = JOptionPane.showInputDialog("one: Would you like to create a new account?\ntwo: Would you like to login to an existing account\nanswer with 'one' or 'two'");
        if(accountOrNot.equals("one"))
        {
            String firstNameNewAccount = JOptionPane.showInputDialog("What is the first name you would like for the account?");
            String lastNameNewAccount = JOptionPane.showInputDialog("What is the last name you would like for the account?");
            double intDeposit = Double.parseDouble(JOptionPane.showInputDialog("How much money would you like to deposit?"));
        }
        if(accountOrNot.equals("two"))
        {
            String firstNameExisting = JOptionPane.showInputDialog("Please enter your username: ");
            String lastNameExisting = JOptionPane.showInputDialog("Please enter your password: ");
        }
    }
}
