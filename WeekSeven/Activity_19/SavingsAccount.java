package WeekSeven.Activity_19;

import javax.swing.*;

public class SavingsAccount
{
    double initailDeposit;
    public SavingsAccount()
    {
        double deposit = Double.parseDouble(JOptionPane.showInputDialog("What is your initial deposit?\nYou must deposit $100 minimum"));
        initailDeposit = deposit;

    }
}
