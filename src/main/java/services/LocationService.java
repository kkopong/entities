package services;

import com.example.Inventory.entities.Customer;
import com.example.Inventory.entities.Location;

import java.util.List;

public interface LocationService {

    public Location addLocation(Location location);

    public List<Location> getSection(String section);

    public List<Location> getShelfNumber(int shelf_number);

    public List<Location> getShelfRow(int shelf_row);

}
