package services;

import com.example.Inventory.entities.Warehouse;

import java.util.List;

public interface WarehouseService {

    public Warehouse addWarehouse(Warehouse warehouse);

    public List<Warehouse> getWarehouseID(String id);

    public List<Warehouse> getLocationID(String id);

    public List<WarehouseManagerService> getManagerID(String id);

    public Warehouse getCapacity (int capacity);




}
