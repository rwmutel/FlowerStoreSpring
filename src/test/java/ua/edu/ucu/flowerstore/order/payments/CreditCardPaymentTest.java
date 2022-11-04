package ua.edu.ucu.flowerstore.order.payments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CreditCardPaymentTest {
    Payment test = new CreditCardPayment();
    @Test
    public void pay() {
        assertTrue(test.pay());
    }
    @Test
    public void getDetails() {
        assertEquals("CreditCard", test.getDetails().get("PaymentType"));
    }
}