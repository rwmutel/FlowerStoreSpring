package ua.edu.ucu.flowerstore.items;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class FlowerPack extends Item {
    private Flower flower;
    private int quantity;
    public FlowerPack(Flower flower, int quantity) {
        price = flower.getPrice() * quantity;
        this.description="Couple flowers of same type";
    }
}
