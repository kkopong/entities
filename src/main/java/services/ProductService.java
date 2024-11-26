package services;

import com.example.Inventory.entities.Location;
import com.example.Inventory.entities.Product;
import com.example.Inventory.entities.Supply;

import java.util.Date;
import java.util.List;

public interface ProductService {

    public Product addProduct(Product product);

    public Supply addSupply(Supply supply);

    public Location addLocation(Location location);

    public List<Product> getManuDate(Date manu_date);

    public List<Product> getProductName(String p_name);

    public List<Product> getQuantity(int quantity);

    public List<Product> getStatus(String status);

    public List<Product> getWeight(int weight);

    public List<Product> getColor(String color);

    public List<Product> getExpirationDate(Date exp_date);










}
