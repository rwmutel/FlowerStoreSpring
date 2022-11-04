package ua.edu.ucu.flowerstore.order.deliveries;

public class PostDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 10;
    }

    @Override
    public boolean setOrder() {
        System.out.println("Order will be sent by usual post!");
        return true;
    }
}
