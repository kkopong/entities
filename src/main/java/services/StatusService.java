package services;

import com.example.Inventory.entities.Status;

import java.util.List;

public interface StatusService {

    public List<Status> getIN_STOCK(String in_stock);

    public List<Status> getRESTOCK(String restock);

    public List<Status> getOUT_OF_STOCK(String out_of_stock);



}
