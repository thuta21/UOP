package com.ecommerce.orders;

import com.ecommerce.Customer;
import com.ecommerce.Product;

import java.util.List;

public class Order {
    private int orderID;
    private Customer customer;
    private List<Product> products;

    public Order(int orderID, Customer customer, List<Product> products) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = products;
    }

    public void generateOrderSummary() {
        // Implement order summary generation logic here
    }

    public void updateOrderStatus() {
        // Implement order status update logic here
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", customer=" + customer +
                ", products=" + customer.getCart().getProducts() +
                '}';
    }
}
