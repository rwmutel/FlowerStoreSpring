package ua.edu.ucu.flowerstore.items.decorators;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.flowerstore.items.Chamomile;
import ua.edu.ucu.flowerstore.items.Flower;
import ua.edu.ucu.flowerstore.items.FlowerColor;
import ua.edu.ucu.flowerstore.items.Item;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {

    Flower testFlower = new Chamomile(50.0, 2.5);
    Item testDecorated = new PaperDecorator(testFlower);
    Item testTwiceDecorated = new BasketDecorator(testDecorated);
    @Test
    void getDescription() {
        assertEquals("Beautiful white flower with yellow center. Wrapped in beautiful paper.",
                testDecorated.getDescription());
        assertEquals(
                "Beautiful white flower with yellow center. Wrapped in beautiful paper. Delivered in a basket.",
                testTwiceDecorated.getDescription());
    }

    @Test
    void getPrice() {
        assertEquals(63.0, testDecorated.getPrice());
        assertEquals(67.0, testTwiceDecorated.getPrice());
    }
}