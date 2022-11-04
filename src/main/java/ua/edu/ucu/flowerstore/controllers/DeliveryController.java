package ua.edu.ucu.flowerstore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.flowerstore.order.deliveries.DHLDelivery;
import ua.edu.ucu.flowerstore.order.deliveries.PostDelivery;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path="api/v1/deliveries")
public class DeliveryController {
    @GetMapping
    public List<Map> getDeliveriesDetails() {
        return List.of(new PostDelivery().getDetails(),
                new DHLDelivery().getDetails());
    }
}
