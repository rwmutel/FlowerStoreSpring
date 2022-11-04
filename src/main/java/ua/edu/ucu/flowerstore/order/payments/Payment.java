package ua.edu.ucu.flowerstore.order.payments;

import java.util.List;

public interface Payment {
    boolean pay();
    List<String> getDetails();
}
