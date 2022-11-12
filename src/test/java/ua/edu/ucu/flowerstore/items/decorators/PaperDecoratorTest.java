package ua.edu.ucu.flowerstore.items.decorators;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.flowerstore.items.Flower;
import ua.edu.ucu.flowerstore.items.FlowerColor;
import ua.edu.ucu.flowerstore.items.Item;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {
    Flower testFlower = new Flower(FlowerColor.RED, 50.0, 2.5);
    Item testDecorated = new PaperDecorator(testFlower);
    @Test
    void getDescription() {
        assertEquals("Simple, yet gorgeous flower. Wrapped in beautiful paper.",
                testDecorated.getDescription());
    }

    @Test
    void getPrice() {
        assertEquals(63.0, testDecorated.getPrice());
    }
}