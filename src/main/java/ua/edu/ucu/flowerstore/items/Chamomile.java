package ua.edu.ucu.flowerstore.items;

import lombok.AllArgsConstructor;
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
        this.description="Beautiful white flower with yellow center";
    }
}
