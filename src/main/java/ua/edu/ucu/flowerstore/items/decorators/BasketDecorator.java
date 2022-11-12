package ua.edu.ucu.flowerstore.items.decorators;

import ua.edu.ucu.flowerstore.items.Item;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        this.item = item;
    }
    public String getDescription() {
        return this.item.getDescription() + " Delivered in a basket.";
    }
    public double getPrice() {
        return this.item.getPrice() + 4.0;
    }
}
