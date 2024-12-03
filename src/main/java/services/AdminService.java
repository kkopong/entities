package services;

import com.example.Inventory.entities.Admin;
import com.example.Inventory.entities.User;
import org.apache.catalina.Manager;

import java.util.List;

public interface AdminService {

    public Admin addAdmin(Admin admin);

    public List<Admin> getAdminID(String id);

    public Admin addUser(User user);

    public List<Admin> getAdminByName(String name);

    public List<Admin> getDescription(String description);

    public List<Admin> setAuthorize(String authorize);

    public List<Admin> getAuthorize(String authorize);

    public List<User> getREQUEST_DEVICE(String request_device);








}
