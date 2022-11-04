package ua.edu.ucu.flowerstore.items;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class FlowerBucket extends Item{
    private final List<FlowerPack> packs = new ArrayList<>();
    public List<FlowerPack> getPacks() {
        return packs;
    }
    public FlowerBucket() {
        this.price = 0;
        this.description="Many flowers of different types";
    }
    public FlowerBucket(List<FlowerPack> flowerPacks){
        this.packs.addAll(flowerPacks);
        this.price += flowerPacks.stream().mapToDouble(Item::getPrice).sum();
        this.description="Many flowers of different types";
    }
    public void add(FlowerPack flowerPack) {
        this.price += flowerPack.getPrice();
        this.packs.add(flowerPack);
    }
}
