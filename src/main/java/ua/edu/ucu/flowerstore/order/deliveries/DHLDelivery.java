package ua.edu.ucu.flowerstore.order.deliveries;

public class DHLDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 20;
    }

    @Override
    public boolean setOrder() {
        System.out.println("Order will be sent by DHL!");
        return true;
    }
}
