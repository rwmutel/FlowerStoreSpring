package ua.edu.ucu.flowerstore.items.decorators;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.flowerstore.items.Flower;
import ua.edu.ucu.flowerstore.items.FlowerColor;
import ua.edu.ucu.flowerstore.items.Item;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {
    Flower testFlower = new Flower(FlowerColor.BLUE, 100.0, 3.1);
    Item testBasket = new BasketDecorator(testFlower);
    Item testBasketRibbon = new RibbonDecorator(testBasket);
    @Test
    void getDescription() {
        assertEquals("Simple, yet gorgeous flower. Delivered in a basket.",
                testBasket.getDescription());
        assertEquals("Simple, yet gorgeous flower. Delivered in a basket. Has a wonderful ribbon on it.",
                testBasketRibbon.getDescription());
    }

    @Test
    void getPrice() {
        assertEquals(104.0, testBasket.getPrice());
        assertEquals(144.0, testBasketRibbon.getPrice());
    }
}