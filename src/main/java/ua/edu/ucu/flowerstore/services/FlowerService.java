package ua.edu.ucu.flowerstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.edu.ucu.flowerstore.items.Flower;
import ua.edu.ucu.flowerstore.items.FlowerColor;

import java.util.List;

@Service
public class FlowerService {
    public FlowerRepository flowerRepository;
    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }
    public List<Flower> getFlowers() {
        return this.flowerRepository.findAll();
    }
    public void addFlower(double sepalLength, double price, FlowerColor color) {
        this.flowerRepository.save(new Flower(color, price, sepalLength));
    }
}
