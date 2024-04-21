package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerID;
    private String name;
    private ShoppingCart cart;

    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.cart = new ShoppingCart();
    }

    public void addToCart(Product product) {
        cart.addProduct(product);
    }

    public void removeFromCart(Product product) {
        cart.removeProduct(product);
    }

    public double calculateTotal() {
        return cart.calculateTotal();
    }

    public void placeOrder() {
        // Implement order placement logic here
    }

    public ShoppingCart getCart() {
        return cart;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", cart=" + cart +
                '}';
    }
}
