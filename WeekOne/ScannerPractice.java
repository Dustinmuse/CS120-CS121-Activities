package WeekOne;

import java.util.Scanner;

public class ScannerPractice
{
    public static void main(String[] args)
    {
        // here where it says console, it can be named whatever you would like because that how you name
        // the scanner for this instance the scanner is named console
        Scanner console = new Scanner(System.in);

        System.out.println("Please enter you first name: ");
        String firstName = console.nextLine();

        System.out.println();

        System.out.println("Please enter you last name: ");
        String lastName = console.nextLine();

        System.out.println();

        System.out.printf("Full name: %s %s", firstName, lastName);

        System.out.println();

        System.out.println("How much money do you have: ");
        double money = console.nextDouble();

        System.out.println();

        System.out.println("How much games do you have: ");
        int games = console.nextInt();

        console.close();
    }
}
