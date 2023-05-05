package WeekThree.Activity_5.restaurant;

import javax.swing.*;

public class restaurantSelector
{
    public static void main(String[] args)
    {
        String vegetarian = JOptionPane.showInputDialog("Is anyone in your party a vegetarian (yes or no): ");
        String vegan = JOptionPane.showInputDialog("Please enter your password (yes or no): ");
        String glutenFree = JOptionPane.showInputDialog("Please enter your password (yes or no): ");

        if(vegetarian.toLowerCase().equals("yes") && vegan.toLowerCase().equals("yes") && glutenFree.toLowerCase().equals("yes"))
        {
            System.out.println("Here are your choices:");
            System.out.println("Corner Café");
            System.out.println("The Chef’s Kitchen");
        }

        else if(vegetarian.toLowerCase().equals("yes") && vegan.toLowerCase().equals("yes") && glutenFree.toLowerCase().equals("no"))
        {
            System.out.println("Here are your choices:");
            System.out.println("Corner Café");
            System.out.println("The Chef’s Kitchen");
        }

        else if(vegetarian.toLowerCase().equals("yes") && vegan.toLowerCase().equals("no") && glutenFree.toLowerCase().equals("no"))
        {
            System.out.println("Here are your choices:");
            System.out.println("Corner Café");
            System.out.println("The Chef’s Kitchen");
            System.out.println("Mama’s Fine Italian");
            System.out.println("Main Street Pizza Company");
        }

        else if(vegetarian.toLowerCase().equals("yes") && vegan.toLowerCase().equals("no") && glutenFree.toLowerCase().equals("yes"))
        {
            System.out.println("Here are your choices:");
            System.out.println("Corner Café");
            System.out.println("The Chef’s Kitchen");
            System.out.println("Main Street Pizza Company");
        }

        else if(vegetarian.toLowerCase().equals("no") && vegan.toLowerCase().equals("no") && glutenFree.toLowerCase().equals("yes"))
        {
            System.out.println("Here are your choices:");
            System.out.println("Corner Café");
            System.out.println("The Chef’s Kitchen");
            System.out.println("Main Street Pizza Company");
        }

        else if(vegetarian.toLowerCase().equals("no") && vegan.toLowerCase().equals("yes") && glutenFree.toLowerCase().equals("yes"))
        {
            System.out.println("Here are your choices:");
            System.out.println("The Chef’s Kitchen");
        }

        else if(vegetarian.toLowerCase().equals("no") && vegan.toLowerCase().equals("yes") && glutenFree.toLowerCase().equals("no"))
        {
            System.out.println("Here are your choices:");
            System.out.println("Corner Café");
            System.out.println("The Chef’s Kitchen");
        }
        else
        {
            System.out.println("Here are your choices:");
            System.out.println("Corner Café");
            System.out.println("The Chef’s Kitchen");
            System.out.println("Main Street Pizza Company");
            System.out.println("Mama’s Fine Italian");
            System.out.println("Joe’s Gourmet Burgers");
        }
    }
}
