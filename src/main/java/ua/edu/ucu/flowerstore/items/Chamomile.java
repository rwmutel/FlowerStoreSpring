package ua.edu.ucu.flowerstore.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Chamomile extends Flower {
    private String description="Beautiful white flower with yellow center.";
    public Chamomile(double price, double sepalLength) {
        super(FlowerColor.WHITE, price, sepalLength);
    }
    public Chamomile() {
        super();
    }
}
