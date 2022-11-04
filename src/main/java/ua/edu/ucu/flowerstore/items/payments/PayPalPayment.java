package ua.edu.ucu.flowerstore.items.payments;

public class PayPalPayment implements Payment {
    @Override
    public boolean pay() {
        System.out.println("Successfully payed using PayPal!");
        return true;
    }
}
