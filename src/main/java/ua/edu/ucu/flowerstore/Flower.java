package ua.edu.ucu.flowerstore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @ToString
public class Flower {
    private FlowerColor color;
    private double price;
    private double sepalLength;

    public Flower() { }

    public Flower(FlowerColor color, int price) {
        this.color = color;
        this.price = price;
    }
}
