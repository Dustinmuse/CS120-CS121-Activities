package WeekThree;

import javax.swing.*;

public class SwitchActivity4
{
    public static void main(String[] args)
    {
        String planet = JOptionPane.showInputDialog("Please enter a name of a planet in all lowercase: ");

        String size;
        String distance;

        switch(planet)
        {
            case "venus":
                size = "3,760.4 mi";
                distance = "67.559 million mi";
                break;

            case "saturn":
                size = "36,184 mi";
                distance = "912.55 million mi";
                break;

            case "neptune":
                size = "30,599 mi";
                distance = "2.7797 billion mi";
                break;

            case "mercury":
                size = "3,031.9 mi";
                distance = "36.924 million mi";
                break;

            case "jupiter":
                size = "460.25 million mi";
                distance = "484 million mi";
                break;

            case "uranus":
                size = "15,759 mi";
                distance = "1.8275 billion mi";
                break;

            case "mars":
                size = "4,212.3 mi";
                distance = "148.74 million mi";
                break;

            case "earth":
                size = "3,958.8 mi";
                distance = "91.496 million mi";
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + planet);
        }
        System.out.println("The planet you chose was " + planet);
        System.out.println("The size of " + planet + " is " + size);
        System.out.println("The distance from " + planet + " to the sun is " + distance);
    }
}
