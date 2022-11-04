package ua.edu.ucu.flowerstore.order.payments;

import lombok.ToString;

import java.util.List;

@ToString
public class CreditCardPayment implements Payment {
    @Override
    public boolean pay() {
        return true;
    }
    @Override
    public List<String> getDetails() {
        return List.of("Successfully payed using CreditCard!");
    }
}
