package ua.edu.ucu.flowerstore.order.payments;

public class CreditCardPayment implements Payment {
    @Override
    public boolean pay() {
        System.out.println("Successfully payed using credit card!");
        return true;
    }
}
