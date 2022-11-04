package ua.edu.ucu.flowerstore.order.payments;

import lombok.ToString;

import java.util.Map;

@ToString
public class PayPalPayment implements Payment {
    @Override
    public boolean pay() {
        return true;
    }

    @Override
    public Map<String, String> getDetails() {
        return Map.of("PaymentType", "PayPal");
    }
}
