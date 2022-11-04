package ua.edu.ucu.flowerstore.items;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class FlowerBucket extends Item{
    private double price;
    private final List<FlowerPack> packs = new ArrayList<>();
    public List<FlowerPack> getPacks() {
        return packs;
    }
    public double getPrice() {
        return price;
    }
    public FlowerBucket() {
        this.description="Many flowers of different types";
    }
    public FlowerBucket(List<FlowerPack> flowerPacks){
        this.packs.addAll(flowerPacks);
        this.price += flowerPacks.stream().mapToDouble(FlowerPack::getPrice).sum();
        this.description="Many flowers of different types";
    }
    public void add(FlowerPack flowerPack) {
        this.price += flowerPack.getPrice();
        this.packs.add(flowerPack);
    }
}
