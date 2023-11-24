package org.example;

import java.util.List;

public class Order {
    private static int nextOrderId = 1;

    private int orderId;
    private List<Product> products;
    private String status;

    public Order(List<Product> products) {
        this.orderId = nextOrderId++;
        this.products = products;
        this.status = "Pending";
    }

    public int getOrderId() {
        return this.orderId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Product> getProducts() {
        return this.products;
    }
}