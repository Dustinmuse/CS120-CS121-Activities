package WeekFifteen.Activity_36;

public class CustomerTest
{
    public static void main(String[] args)
    {
        CustomerRecord one = new CustomerRecord();
        Customer two = new Customer("Billy", "Jones", "17658737721", "Billy.Jones@gamil.com", "3749734", 22);

        one.addCustomers(two);
        System.out.println(one.customerInfo());
    }
}
