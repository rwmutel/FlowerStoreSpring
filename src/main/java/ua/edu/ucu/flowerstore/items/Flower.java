package ua.edu.ucu.flowerstore.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @ToString
public class Flower extends Item{
    private FlowerColor color;
    private double price;
    private double sepalLength;
    public Flower() {}
}
