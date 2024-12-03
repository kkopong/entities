package services;

import com.example.Inventory.entities.Description;

import java.util.Date;
import java.util.List;

public interface DescriptionService {

    public Description addDescription(Description description);

    public List<Description> getManuDate(Date manu_date);

    public List<Description> getProductName(String p_name);

    public List<Description> getQuantity(int quantity);

    public List<Description> getColor(String color);












}
