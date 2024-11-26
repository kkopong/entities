package services;

import com.example.Inventory.entities.Supply;
import java.util.List;

public interface SupplyService {

    public Supply addSupply(Supply supply);

    public List<Supply> getSupplierID(String id);

    public List<Supply> getorigin(String origin);

    public Supply getQuantity (int quantity);

    public Supply getStatus (String status);







}
