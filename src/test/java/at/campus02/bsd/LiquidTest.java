package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LiquidTest {

    private Liquid liquid;

    @BeforeEach
    void setUp() {
        liquid = new Liquid("Default", 1.0, 0.0);
    }

    @Test
    void testGetName() {
        liquid.setName("Juice");
        assertEquals("Juice", liquid.getName());
    }

    @Test
    void testSetName() {
        liquid.setName("oldName");
        liquid.setName("newName");
        assertEquals("newName", liquid.getName());
    }

    @Test
    void testGetVolume() {
        liquid.setName("Water");
        liquid.setVolume(1.0);
        assertEquals(1.0, liquid.getVolume());
    }

    @Test
    void testSetVolume() {
        liquid.setName("Water");
        liquid.setVolume(1.0);
        liquid.setVolume(0.5);
        assertEquals(0.5, liquid.getVolume());
    }

    @Test
    void testGetAlcoholPercent() {
        liquid.setName("Wine");
        liquid.setVolume(0.75);
        liquid.setAlcoholPercent(12.5);
        assertEquals(12.5, liquid.getAlcoholPercent());
    }

    @Test
    void testSetAlcoholPercent() {
        liquid.setName("Wine");
        liquid.setVolume(0.75);
        liquid.setAlcoholPercent(12.5);
        liquid.setAlcoholPercent(10.0);
        assertEquals(10.0, liquid.getAlcoholPercent());
    }
}