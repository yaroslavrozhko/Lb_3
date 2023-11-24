import org.example.Cart;
import org.example.ECommerce;
import org.example.Order;
import org.example.Product;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ECommerceTest {
    private Cart cart;
    private Product product1;
    private Product product2;

    @Mock
    private ECommerce eCommerce;

    @Before
    public void setUp() {
        cart = new Cart();
        product1 = new Product(1, "Laptop", 1000.0);
        product2 = new Product(2, "Mouse", 20.0);
        eCommerce = mock(ECommerce.class);
    }

    @Test
    public void testAddProductToCart() {
        cart.addProduct(product1);
        assertEquals(1, cart.getProducts().size());
    }

    @Test
    public void testRemoveProductFromCart() {
        cart.addProduct(product1);
        cart.removeProduct(product1);
        assertTrue(cart.getProducts().isEmpty());
    }

    @Test
    public void testPlaceOrder() {
        cart.addProduct(product1);
        cart.addProduct(product2);

        // Викликаємо метод placeOrder через об'єкт eCommerce
        Order order = eCommerce.placeOrder(cart);

        // Перевіряємо, чи order став "Confirmed"
        assertEquals("Confirmed", order.getStatus());

        // Перевіряємо, чи кількість продуктів у замовленні дорівнює 2
        assertEquals(2, order.getProducts().size());
    }
    @Test
    public void testGetOrderStatus() {
        cart.addProduct(product1);
        Order order = eCommerce.placeOrder(cart);

        // Виведення статусу перед зміною
        System.out.println("Before: " + order.getStatus());

        // Очікується "Confirmed"
        assertEquals("Confirmed", order.getStatus());

        // Виведення статусу після зміни
        System.out.println("After: " + order.getStatus());

        // Перевірка статусу після зміни
        assertEquals("Confirmed", order.getStatus());
    }
}
