package ua.edu.ucu.flowerstore;

public class FlowerPack {
    private Flower flower;
    private int quantity;
    private double price = 0;
    public FlowerPack(Flower flower, int quantity) {
        price = flower.getPrice() * quantity;
    }
    public double getPrice() {
        return price;
    }
}
