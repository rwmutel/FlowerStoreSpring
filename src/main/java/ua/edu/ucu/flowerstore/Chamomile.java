package ua.edu.ucu.flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Chamomile extends Flower {
    public Chamomile(double price, double sepalLength) {
        super(FlowerColor.WHITE, price, sepalLength);
    }
    public Chamomile() {
        super();
    }
}
