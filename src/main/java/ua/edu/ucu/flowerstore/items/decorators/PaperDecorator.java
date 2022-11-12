package ua.edu.ucu.flowerstore.items.decorators;

import ua.edu.ucu.flowerstore.items.Item;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        this.item = item;
    }
    public String getDescription() {
        return this.item.getDescription() + " Wrapped in beautiful paper.";
    }
    public double getPrice() {
        return this.item.getPrice() + 13.0;
    }
}
