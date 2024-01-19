package firstMavenProject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise {

    public static void main(String[] args) {

        Product prod1 = new Product(1, 1200, "PC", "Boys");
        Product prod2 = new Product(2, 250, "PS4", "Svago");
        Product prod3 = new Product(3, 30, "Chicco", "Boys");
        Product prod4 = new Product(4, 180, "Harry Potter", "Books");
        Product prod5 = new Product(5, 150, "Game of Thrones", "Books");

        Customer c1 = new Customer(1, 3, "Davide");
        Customer c2 = new Customer(2, 1, "Andrea");
        Customer c3 = new Customer(3, 2, "Fabio");
        Customer c4 = new Customer(4, 2, "Simone");
        Customer c5 = new Customer(5, 4, "Manzo");

        Order order1 = new Order(1, c2, "Delivered", LocalDate.now(), LocalDate.now().plusDays(3), List.of(prod1, prod3, prod4));
        Order order2 = new Order(2, c5, "Pending", LocalDate.now(), LocalDate.now().plusDays(7), List.of(prod1, prod1, prod5, prod4));
        Order order3 = new Order(3, c1, "Unauthorized", LocalDate.now(), LocalDate.now().plusDays(1), List.of(prod2, prod3));
        Order order4 = new Order(4, c2, "Pending", LocalDate.now(), LocalDate.now().plusDays(7), List.of(prod5, prod4));
        Order order5 = new Order(5, c2, "Pending", LocalDate.now(), LocalDate.now().plusDays(7), List.of(prod1, prod4, prod4, prod4));

        System.out.println(order1.toString());

        Map<Customer, List<Order>> customerOrder =  List.of(order1, order2, order3, order4).stream().collect(Collectors.groupingBy(Order::getCustomer));

        System.out.println(customerOrder);
        // List<Product> mostExpensive = List.of(prod1, prod2, prod3).stream().
    }
}
