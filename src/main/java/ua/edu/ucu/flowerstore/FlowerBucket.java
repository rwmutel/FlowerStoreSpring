package ua.edu.ucu.flowerstore;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @ToString
public class FlowerBucket {
    private double price;
    private final List<FlowerPack> packs = new ArrayList<>();
    public List<FlowerPack> getPacks() {
        return packs;
    }
    public double getPrice() {
        return price;
    }
    public FlowerBucket(List<FlowerPack> flowerPacks){
        this.packs.addAll(flowerPacks);
        this.price += flowerPacks.stream().mapToDouble(FlowerPack::getPrice).sum();
    }
    public void add(FlowerPack flowerPack) {
        this.price += flowerPack.getPrice();
        this.packs.add(flowerPack);
    }
}
