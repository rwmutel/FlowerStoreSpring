package ua.edu.ucu.flowerstore.items;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Flower extends Item{
    @Id
    @GeneratedValue
    private int id;
    private FlowerColor color;
    private double price;
    private double sepalLength;
    protected String description = "Simple, yet gorgeous flower.";

    public Flower(FlowerColor color, double price, double sepalLength) {
        this.color = color;
        this.price = price;
        this.sepalLength = sepalLength;
    }
}
