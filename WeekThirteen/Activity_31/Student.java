package WeekThirteen.Activity_31;

import java.util.LinkedList;

public class Student
{
    String firstName;
    String lastName;
    int id;
    String major;
    String classStanding;
    double gpa;
    LinkedList<String> courseList = new LinkedList<>();

    public Student(String firstName, String lastName, int id, String major, String classStanding, double gpa)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.major = major;
        this.classStanding = classStanding;
        this.gpa = gpa;
    }

    public void addCourse(String course)
    {
        courseList.add(course);
    }
    public void removeCourse(String course)
    {
        courseList.remove(course);
    }
    public void getStudentInfo()
    {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("ID: " + id);
        System.out.println("Major: " + major);
        System.out.println("Class standing: " + classStanding);
        System.out.println("GPA: " + gpa);
    }
    public void displayStudentCourses()
    {
        for(String i: courseList)
        {
            System.out.println(i);
        }
    }
}
