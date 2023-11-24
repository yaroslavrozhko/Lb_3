package org.example;

import java.util.List;

public class ECommerce {
    public static void main(String[] args) {
        // Приклад використання системи
        Product product1 = new Product(1, "Laptop", 1000.0);
        Product product2 = new Product(2, "Mouse", 20.0);

        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        // Розміщення замовлення
        Order order = placeOrder(cart);

        // Виведення статусу замовлення
        System.out.println("Order Status: " + order.getStatus());
    }

    public static Order placeOrder(Cart cart) {
        List<Product> productsInCart = cart.getProducts();
        Order order = new Order(productsInCart);
        // Логіка розміщення замовлення (наприклад, збереження в базі даних)

        // Змінюємо статус замовлення
        order.setStatus("Confirmed");

        return order;
    }
}