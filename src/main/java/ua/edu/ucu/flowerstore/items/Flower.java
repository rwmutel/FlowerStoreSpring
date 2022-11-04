package ua.edu.ucu.flowerstore.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Flower extends Item{
    private FlowerColor color;
    private double sepalLength;
    public Flower() {}
    public Flower(FlowerColor color, double price, double sepalLength) {
        this.color = color;
        this.price = price;
        this.sepalLength = sepalLength;
    }
}
