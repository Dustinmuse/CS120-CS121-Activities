package WeekFifteen.Activity_36;

import java.util.ArrayList;

public class CustomerRecord
{
    public ArrayList<Customer> customers = new ArrayList<>();
    public StringBuilder stringBuilder = new StringBuilder();

    public void addCustomers(Customer name)
    {
        customers.add(name);
    }

    public String customerInfo()
    {
        for(Customer i: customers)
        {
            stringBuilder.append(i.getCustomerInfo());
        }
        return stringBuilder.toString();
    }
}
