import src.Gender;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface OrderInterfaceAble {
    String createOrder(Set<Order>orders);
    Set<Order> findallOrders();
    Order removeByName(String name);
    Map<Integer, Order> getAge();
    String name(String name);
    Map<Gender, List<Order>> groupingByGender();
    public Order finById(Long id);
}
