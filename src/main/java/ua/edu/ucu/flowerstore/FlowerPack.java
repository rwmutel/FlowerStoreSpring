package ua.edu.ucu.flowerstore;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class FlowerPack {
    private Flower flower;
    private int quantity;
    private double price = 0;
    public FlowerPack(Flower flower, int quantity) {
        price = flower.getPrice() * quantity;
    }
}
