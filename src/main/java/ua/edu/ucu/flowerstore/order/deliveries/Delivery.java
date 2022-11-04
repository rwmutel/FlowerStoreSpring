package ua.edu.ucu.flowerstore.order.deliveries;

public interface Delivery {
    boolean delivered = false;
    double getPrice();
    boolean setOrder();
}
