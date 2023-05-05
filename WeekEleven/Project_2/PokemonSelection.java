package WeekEleven.Project_2;

import javax.swing.*;

public class PokemonSelection
{
    public Pokemon createPokemon()
    {
        String name1 = JOptionPane.showInputDialog("Please enter your pokemon's name");
        double health1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the hit points of your pokemon"));
        String moveName1 = JOptionPane.showInputDialog("Please enter the name of the attack from your pokemon");
        double damage1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the power of the attack"));
        double speed1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the speed of your pokemon"));

        Pokemon one = new Pokemon(name1, health1, moveName1, damage1, speed1);

        return one;
    }
    public void assignPokemon()
    {
        for(int i = 1; i <= 2; i++)
        {
            System.out.println("Player " + i + ": select a Pokemon and enter its stats");
            Pokemon pokemon1 = createPokemon();
            System.out.println();
            System.out.println("Player " + i + "'s Pokemon:");
            System.out.println();
            pokemon1.displayStats();
            System.out.println();
        }
    }
}
