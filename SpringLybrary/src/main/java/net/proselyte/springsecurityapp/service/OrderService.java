package net.proselyte.springsecurityapp.service;

import net.proselyte.springsecurityapp.model.Document;
import net.proselyte.springsecurityapp.model.Order;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.security.PublicKey;
import java.util.List;

@Service
public interface OrderService {

    public List<Order> getAllOrders();
    public List<Order> getAllFinishedOrders();
    public List<Order> getOrdersByUserId(int userId);
    public List<Order> getOrdersByUserIdAndItemId(int userId,int itemid);
    public List<Order> getOpenOrdersByUserId(int userId);
    public List<Order> getQueue(int documentId);
    public List<Order> getOrdersByStatus(String status);
    public void save(Order order);
    public Order get(int id);

}
