import src.Gender;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Order> orders = new LinkedHashSet<>();
        orders.add(new Order(1L,"kutman","kaseiinov", Gender.MALE, LocalDate.of(2004,6,11),"343444343"));
        orders.add(new Order(2L,"davran","kaseiinov", Gender.MALE, LocalDate.of(2003,6,11),"343444343"));
        orders.add(new Order(3L,"kanykei","kaseiinov", Gender.FAMALE, LocalDate.of(2006,6,11),"343444343"));
        orders.add(new Order(4L,"ilim","kaseiinov", Gender.MALE, LocalDate.of(2007,6,11),"343444343"));
        orders.add(new Order(5L,"khafis","kaseiinov", Gender.FAMALE, LocalDate.of(2000,6,11),"343444343"));

        OrderServicesImpl orderServices = new OrderServicesImpl();
        orderServices.createOrder(orders);
        while (true){
            System.out.println("""
                    1 get order
                    2 groping by gender
                    3 remuve name
                    4 get age map
                    5 reverse name""");
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                System.out.println(orderServices.findallOrders());
                break;
                case 2:
                    System.out.println(orderServices.groupingByGender());
                    break;
                case 3:
                    System.out.println("edd");
                    String b = scanner.nextLine();
                    orderServices.removeByName(scanner.nextLine());
                    break;
                case 4:
                    System.out.println(orderServices.getAge());
                    break;
                case 5:
                    String f= scanner.nextLine();
                    System.out.println("ddx");
                    System.out.println(orderServices.name(scanner.nextLine()));
                    break;

            }
        }




    }
}