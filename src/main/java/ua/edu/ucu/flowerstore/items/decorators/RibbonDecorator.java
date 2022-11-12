package ua.edu.ucu.flowerstore.items.decorators;

import ua.edu.ucu.flowerstore.items.Flower;
import ua.edu.ucu.flowerstore.items.FlowerColor;
import ua.edu.ucu.flowerstore.items.Item;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        this.item = item;
    }
    public String getDescription() {
        return this.item.getDescription() + " Has a wonderful ribbon on it.";
    }
    public double getPrice() {
        return this.item.getPrice() + 40.0;
    }
}
