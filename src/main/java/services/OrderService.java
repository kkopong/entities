package services;

import com.example.Inventory.entities.Customer;
import com.example.Inventory.entities.Order;

import java.util.Date;
import java.util.List;

public interface OrderService {

    public Order addOrder (Customer order);

    public List<Order> getOrderID(String id);

    public List<Customer> getCustomerID(String id);

    public List<Order> getOrderDate(Date order_date);

    public List<Order> getDeliveryDate(Date delivery_date);

    public List<Order> getTotalAmount(int total_amount);

    public List<Order> getPrice(int price);










}
