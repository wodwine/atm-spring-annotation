package th.ac.ku.atm;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataSourceDB implements DataSource{
    public Map<Integer, Customer> readCustomer(){
        // ...... connect to database ....  \\

        Map<Integer, Customer> customers = new HashMap<>();
        Customer wine = new Customer(1,"Wine",123,1000);
        Customer lnw = new Customer(2,"lnw",456,3000);
        Customer lnwWine = new Customer(3,"lnwWine",789);
        customers.put(1,wine);
        customers.put(2,lnw);
        customers.put(3,lnwWine);
        return customers;
    }
}
