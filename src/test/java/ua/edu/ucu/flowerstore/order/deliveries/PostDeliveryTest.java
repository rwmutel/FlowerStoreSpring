package ua.edu.ucu.flowerstore.order.deliveries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryTest {
    Delivery test = new PostDelivery();
    @Test
    void getPrice() {
        assertEquals(10, test.getPrice());
    }

    @Test
    void setOrder() {
        assertTrue(test.setOrder());
    }

    @Test
    void getDetails() {
        assertEquals("Post", test.getDetails().get("Type"));
        assertEquals("10.0", test.getDetails().get("Price"));
    }
}