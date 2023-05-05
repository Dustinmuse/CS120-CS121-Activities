package WeekFifteen.Activity_34;

import javax.swing.*;

public class MainTest
{
    public static void main(String[] args)
    {
        int calPerDay = Integer.parseInt(JOptionPane.showInputDialog("How many calories do you eat per day?"));
        String start = JOptionPane.showInputDialog("When will your diet start?");
        String end = JOptionPane.showInputDialog("When will your diet end?");
        TotalCalories one = new TotalCalories();

        System.out.println(one.totalCalorie(calPerDay, start, end));
    }
}
