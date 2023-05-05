package WeekTen.Activity_20;

public class InterfaceSubClass1 implements InterfaceClasses
{
        double salary;
        String name;
        public InterfaceSubClass1(String name, double salary)
        {
            this.name = name;
            this.salary = salary;
        }
        @Override
        public String toString()
        {
            return super.toString() + " salary: " + salary;
        }
        public String getName()
        {
            return name;
        }
}
