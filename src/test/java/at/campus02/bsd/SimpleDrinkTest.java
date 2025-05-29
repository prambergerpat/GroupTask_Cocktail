package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleDrinkTest {

    private SimpleDrink juice;
    private SimpleDrink wine;
    private SimpleDrink rum;
    private SimpleDrink water;

    @BeforeEach
    void setUp() {
        juice = new SimpleDrink("Apple Juice", new Liquid("Juice", 0.5, 0.0));
        wine = new SimpleDrink("Wine", new Liquid("Wine", 0.3, 12.0));
        rum = new SimpleDrink("Rum", new Liquid("Rum", 0.5, 50.0));
        water= new SimpleDrink("Water", new Liquid("Water", 0.5, 0.0));
    }

    @Test
    void testGetVolume() {
        assertEquals(0.5, juice.getVolume());
    }

    @Test
    void testGetAlcoholPercent() {
        assertEquals(12.0, wine.getAlcoholPercent());
    }

    @Test
    void testIsAlcoholicTrue() {
        assertTrue(rum.isAlcoholic());
    }

    @Test
    void testIsAlcoholicFalse() {
        assertFalse(water.isAlcoholic());
    }

}
