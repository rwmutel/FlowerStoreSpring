package ua.edu.ucu.flowerstore.order;

import ua.edu.ucu.flowerstore.items.Item;
import ua.edu.ucu.flowerstore.order.deliveries.Delivery;
import ua.edu.ucu.flowerstore.order.payments.Payment;

import java.util.LinkedList;
import java.util.List;

public class Order {
    private final List<Item> items = new LinkedList<Item>();
    private Payment payment;
    private Delivery delivery;

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
    public double calculateTotalPrice() {
        return this.items.stream().mapToDouble(Item::getPrice).sum();
    }
    public void addItem(Item item) {
        this.items.add(item);
    }
    public void removeItem(int index) {
        this.items.remove(index);
    }
}
