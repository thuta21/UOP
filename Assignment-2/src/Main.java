import com.ecommerce.Customer;
import com.ecommerce.Product;
import com.ecommerce.ShoppingCart;
import com.ecommerce.orders.Order;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Demonstrate the use of packages and classes
        Product product1 = new Product(1, "Product 1", 50.0);
        Product product2 = new Product(2, "Product 2", 30.0);

        Customer customer1 = new Customer(1, "John Doe");
        customer1.addToCart(product1);
        customer1.addToCart(product2);

        Order order1 = new Order(1, customer1, customer1.getCart().getProducts());
        order1.generateOrderSummary();

        System.out.println("Customer: " + customer1);
        System.out.println("Order: " + order1);
    }
}
