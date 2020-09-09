package th.ac.ku.atm;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Component
@Primary
public class DataSourceFile implements DataSource {
    public Map<Integer, Customer> readCustomer() {
        // ...... connect to database ....  \\
        Map<Integer, Customer> customers = new HashMap<>();
        try {
            File myObj = new File("customers.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] new_data = data.split(" ");
                int id = Integer.parseInt(new_data[0]);
                String name = new_data[1];
                int pin = Integer.parseInt(new_data[2]);
                double balance = Double.parseDouble(new_data[3]);
                Customer customer = new Customer(id, name, pin, balance);
                customers.put(id, customer);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return customers;
    }
}

