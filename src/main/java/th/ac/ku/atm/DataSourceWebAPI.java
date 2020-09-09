package th.ac.ku.atm;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataSourceWebAPI implements DataSource {

    public Map<Integer, Customer> readCustomer() {
        // ...... connect to database ....  \\
        Map<Integer, Customer> customers = new HashMap<>();
        Customer wineZaBa = new Customer(5, "Wine Za Ba", 111, 1000);
        customers.put(5, wineZaBa);
        return customers;
    }
}
