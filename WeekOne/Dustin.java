package WeekOne;

public class Dustin
{
    public static void main(String[] args)
    {
        int age;
        double gpa;
        char letterGrade;
        boolean csMajor;
        String name;
        age = 18;
        name = "Dustin";
        gpa = 4.0;
        letterGrade = 'A';
        csMajor = true;

        String favoriteColor;
        favoriteColor = "purple";

        //When using substring you have to use string variable
        String firstInital = name.substring(0,1);

        // or you can use this

        //when using charAt() you must use char
        char firstInital2 = name.charAt(0);

        //%s = strings
        //%d = integers
        //%f = doubles
        //%c = characters

        String info = String.format("age: %d, gpa: %.1f, letterGrade: %c", age, gpa, letterGrade);

        System.out.println(info);

        System.out.println();

        // the /n makes it go to a new line
        // the .1 shows that you want the double to go out 1 decimal place
        // if you want two decimal places you would use .2
        System.out.printf("age: %d\ngpa: %.1f\nletterGrade: %c\n", age, gpa, letterGrade);

        System.out.println();

        System.out.printf("name: %s", name);

        System.out.println();

        System.out.printf("first inital: %s", firstInital);

        System.out.println();

        //both ways work

        System.out.printf("first inital: %s", firstInital2);

        System.out.println();


        //another way of doing this

        System.out.printf("first inital: %s", name.charAt(0));

        System.out.println();


        //or you cn do it this way

        System.out.printf("first inital: %s", name.substring(0,1));


    }
}