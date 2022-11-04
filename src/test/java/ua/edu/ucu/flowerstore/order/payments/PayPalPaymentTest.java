package ua.edu.ucu.flowerstore.order.payments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentTest {
    Payment test = new PayPalPayment();
    @Test
    public void pay() {
        assertTrue(test.pay());
    }
    @Test
    public void getDetails() {
        assertEquals("PayPal", test.getDetails().get("PaymentType"));
    }
}