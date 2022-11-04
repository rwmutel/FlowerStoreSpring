package ua.edu.ucu.flowerstore.order.deliveries;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DHLDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 20;
    }

    @Override
    public boolean setOrder() {
        return true;
    }
    @Override
    public Map<String, String> getDetails() {
        return Map.of("Type", "DHL",
                        "Price", String.valueOf(this.getPrice()));
    }
}
