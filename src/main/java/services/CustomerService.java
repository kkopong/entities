package services;

import com.example.Inventory.entities.Customer;

import java.util.List;

public interface CustomerService {

    public Customer addCustomer(Customer customer);

    public List<Customer> getCustomerID(String id);

    public List<Customer> getCustomerName(String name);

    public List<Customer> getCustomerAddress(String address);

    public List<Customer> getCustomerPhoneNumber(String phone_number);





}
