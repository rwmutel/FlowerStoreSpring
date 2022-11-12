package ua.edu.ucu.flowerstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.flowerstore.items.Flower;
import ua.edu.ucu.flowerstore.items.FlowerColor;
import ua.edu.ucu.flowerstore.services.FlowerService;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/flower")
public class FlowerController {
    private FlowerService flowerService;
    @Autowired
    public void FLowerController(FlowerService flowerService){
        this.flowerService = flowerService;
    }
    @GetMapping
    public List<Flower> getFlowers(){
        return this.flowerService.getFlowers();
    }
    @PostMapping
    public void addFlower(double sepalLength, double price, FlowerColor color){
        this.flowerService.addFlower(sepalLength, price, color);
    }
}
