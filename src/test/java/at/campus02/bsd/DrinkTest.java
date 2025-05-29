package at.campus02.bsd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrinkTest {

    @DisplayName("Test getName method")
    @Test
    public void testGetName() {
        SimpleDrink drink = new SimpleDrink("Juice", new Liquid("Juice", 0.5, 0.0));

        assertEquals("Juice", drink.getName());
    }

    @DisplayName("Test setName method")
    @Test
    public void testSetName() {
        SimpleDrink drink = new SimpleDrink("Juice", new Liquid("Juice", 0.5, 0.0));
        drink.setName("betterJuice");
        assertEquals("betterJuice", drink.getName());
    }
}
