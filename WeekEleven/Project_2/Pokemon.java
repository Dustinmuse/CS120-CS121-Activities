package WeekEleven.Project_2;

public class Pokemon
{
    String name1;
    double health1;
    String moveName1;
    double damage1;
    double speed1;

    public Pokemon(String name, double health, String moveName, double damage, double speed)
    {
        this.name1 = name;
        this.health1 = health;
        this.moveName1 = moveName;
        this.damage1 = damage;
        this.speed1 = speed;
    }
    public String getName()
    {
        return name1;
    }
    public void setName(String name)
    {
        name1 = name;
    }
    public double getHealth()
    {
        return health1;
    }
    public void setHealth(double health)
    {
        health1 = health;
    }
    public String getMoveName()
    {
        return moveName1;
    }
    public void setMoveName(String moveName)
    {
        moveName1 = moveName;
    }
    public double getDamage()
    {
        return damage1;
    }
    public void setDamage(double damage)
    {
        damage1 = damage;
    }
    public double getSpeed()
    {
        return speed1;
    }
    public void setSpeed(double speed)
    {
        speed1 = speed;
    }
    public void displayStats()
    {
        System.out.println("Name: " + name1);
        System.out.println("Health: " + health1);
        System.out.println("Move name: " + moveName1);
        System.out.println("Damage: " + damage1);
        System.out.println("Speed: " + speed1);
    }
}
