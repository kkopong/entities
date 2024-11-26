package services;

import com.example.Inventory.entities.WarehouseManager;
import org.apache.catalina.Manager;

import java.util.List;

public interface WarehouseManagerService {

    public WarehouseManager addWarehouseManager(WarehouseManager warehouseManager);

    public List<WarehouseManager> getManagerID(String id);

    public WarehouseManager addManager(Manager manager);

    public List<WarehouseManager> getManagerByName(String name);


}
