import java.util.Date;

import entities.Order;
import entities.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Order order = new Order(1000,new Date(), OrderStatus.PENDING_PAYMENT);
    
    System.out.println(order);
    
    }
}
