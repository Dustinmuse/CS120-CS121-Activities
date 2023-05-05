package WeekFive.Activity_12;

public class talk
{
    String name;
    int id;
    String major;
    double gpa;
    public talk(String n, int i, String m, double g)
    {
        //could also use this.name
        name = n;
        //this.id
        id = i;
        //this.major
        major = m;
        //this.gpa
        gpa = g;
    }
    public void getInfo()
    {
        System.out.println("name: " + name + "\nid: " + id + "\nmajor: " + major + "\ngpa: " + gpa);
    }
}
