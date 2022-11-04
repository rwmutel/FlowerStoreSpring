package ua.edu.ucu.flowerstore.order.payments;

import java.util.Map;

public interface Payment {
    boolean pay();
    Map<String, String> getDetails();
}
