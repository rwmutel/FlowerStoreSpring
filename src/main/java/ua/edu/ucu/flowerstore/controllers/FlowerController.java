package ua.edu.ucu.flowerstore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.flowerstore.items.Flower;
import ua.edu.ucu.flowerstore.items.FlowerColor;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/flower")
public class FlowerController {
    @GetMapping
    public List<Flower> getFlowers(){
        return List.of(new Flower(FlowerColor.BLUE, 2.0, 100),
                new Flower(FlowerColor.WHITE, 3.5, 120));
    }
}
