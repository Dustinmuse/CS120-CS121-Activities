package WeekThirteen.Activity_31;

public class StudentMain
{
    public static void main(String[] args)
    {
        Student one = new Student("Billy", "Jones", 55821, "English", "Senior", 3.89);
        Student two = new Student("Cayden", "Hills", 19438, "Biology", "Freshman", 2.42);

        one.addCourse("History");
        one.addCourse("English");
        one.addCourse("Math");

        two.addCourse("Conditioning");
        two.addCourse("Communication");
        two.addCourse("Biology");

        one.getStudentInfo();
        one.displayStudentCourses();

        System.out.println();

        two.getStudentInfo();
        two.displayStudentCourses();

        System.out.println();

        one.removeCourse("Math");
        two.removeCourse("Communication");

        one.displayStudentCourses();

        System.out.println();

        two.displayStudentCourses();
    }
}
