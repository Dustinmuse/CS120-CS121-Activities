package WeekFour.Project_1;

import javax.swing.*;
import java.util.Random;

public class pokemonGame
{
    public static void main(String[] args)
    {
        int rounds = Integer.parseInt(JOptionPane.showInputDialog("Please enter an odd number of rounds without decimals: "));
        int player1Counter = 0;
        int player2Counter = 0;
        for(int current = 1; current <= rounds; current++) {
            String name1 = JOptionPane.showInputDialog("Please enter your pokemon's name for player 1: ");
            double health1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the hit points of your pokemon for player 1: "));
            String moveName1 = JOptionPane.showInputDialog("Please enter the name of the attack from your pokemon for player 1: ");
            double damage1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the power of the attack for player 1: "));
            double speed1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the speed of your pokemon for player 1: "));

            String name2 = JOptionPane.showInputDialog("Please enter your pokemon's name for player 2: ");
            double health2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the hit points of your pokemon for player 2: "));
            String moveName2 = JOptionPane.showInputDialog("Please enter the name of the attack from your pokemon for player 2: ");
            double damage2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the power of the attack for player 2: "));
            double speed2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the speed of your pokemon for player 2: "));

            Random random = new Random();
            int randomInt = random.nextInt(2);
            if (speed1 > speed2)
            {
                while(health1 != 0 || health2 != 0)
                {
                    health2 -= damage1;
                    if (health2 <= 0)
                    {
                        player1Counter += 1;
                        System.out.println(name1 + " is the winner\nPlayer 1: " + player1Counter + "\nPlayer2: " + player2Counter);
                        break;
                    }
                    health1 -= damage2;
                    if (health1 <= 0)
                    {
                        player2Counter += 1;
                        System.out.println(name2 + " is the winner\nPlayer 1: " + player1Counter + "\nPlayer2: " + player2Counter);
                        break;
                    }
                }
            }
            else if(speed1 < speed2)
            {
                while(health1 != 0 || health2 != 0)
                {
                    health1 -= damage2;
                    if (health1 <= 0)
                    {
                        player2Counter += 1;
                        System.out.println(name2 + " is the winner\nPlayer 1: " + player1Counter + "\nPlayer2: " + player2Counter);
                        break;
                    }
                    health2 -= damage1;
                    if (health2 <= 0)
                    {
                        player1Counter += 1;
                        System.out.println(name1 + " is the winner\nPlayer 1: " + player1Counter + "\nPlayer2: " + player2Counter);
                        break;
                    }
                }
            }
            else
            {
                if (randomInt == 0)
                {
                    while(health1 != 0 || health2 != 0)
                    {
                        health2 -= damage1;
                        if (health2 <= 0)
                        {
                            player1Counter += 1;
                            System.out.println(name1 + " is the winner\nPlayer 1: " + player1Counter + "\nPlayer2: " + player2Counter);
                            break;
                        }
                        health1 -= damage2;
                        if (health1 <= 0)
                        {
                            player2Counter += 1;
                            System.out.println(name2 + " is the winner\nPlayer 1: " + player1Counter + "\nPlayer2: " + player2Counter);
                            break;
                        }
                    }
                }
                else if(randomInt == 1)
                {
                    while(health1 != 0 || health2 != 0)
                    {
                        health1 -= damage2;
                        if (health1 <= 0)
                        {
                            player2Counter += 1;
                            System.out.println(name2 + " is the winner\nPlayer 1: " + player1Counter + "\nPlayer2: " + player2Counter);
                            break;
                        }
                        health2 -= damage1;
                        if (health2 <= 0)
                        {
                            player1Counter += 1;
                            System.out.println(name1 + " is the winner\nPlayer 1: " + player1Counter + "\nPlayer2: " + player2Counter);
                            break;
                        }
                    }
                }
            }
        }
    }
}
