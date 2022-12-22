import src.Gender;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class OrderServicesImpl implements OrderInterfaceAble {
    Set<Order> orders = new LinkedHashSet<>();


    @Override
    public String createOrder(Set<Order> orders) {
        this.orders.addAll(orders);
        return null;
    }

    @Override
    public Set<Order> findallOrders() {
        return this.orders;
    }

    @Override
    public Order removeByName(String name) {
        for (Order order : this.orders) {
            if (order.getName().equalsIgnoreCase(name)) {
                this.orders.remove(order);
                return order;
            }
        }
        return null;
    }

    @Override
    public Map<Integer, Order> getAge() {
        Map<Integer,Order> orderMap = new TreeMap<>();
        List<Order>orders1 = new ArrayList<>();
        orders1.addAll(this.orders);
        for (Order order : this.orders) {
            int i = LocalDate.now().getYear() -order.getAge().getYear();
            orderMap.put(i,order);
        }
        return orderMap;
    }

    @Override
    public String name(String name) {
        for (Order order : this.orders) {
            if (order.getName().equalsIgnoreCase(name)) {
                StringBuilder stringBuilder = new StringBuilder(order.getName());
                stringBuilder.reverse();
                return "" + stringBuilder;
            }
        }
        return null;
    }

    @Override
    public Map<Gender,List<Order>> groupingByGender() {
        return orders.stream().collect(Collectors.groupingBy(Order::getGender));
    }
    public Order finById(Long id){
        for (Order order : this.orders) {
            if(order.getId()==id){
                return order;
            }
        }
        return null;
    }
}
