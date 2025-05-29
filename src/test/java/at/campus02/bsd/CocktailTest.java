package at.campus02.bsd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CocktailTest {

    static Cocktail cocktail;

    @BeforeAll
    static void setUp() {
        List<Liquid> liquidList = new ArrayList<>();
        liquidList.add(new Liquid("RedBull", 0.2, 0));
        liquidList.add(new Liquid("Vodka", 0.05, 38));

        cocktail = new Cocktail("VodkaBull", liquidList);
    }

    @DisplayName("Testing testGetVolume() method")
    @Test
    void testGetVolume() {
        assertEquals(0.25, cocktail.getVolume());
    }

    @DisplayName("Testing testGetAlcoholPrecent() method")
    @Test
    void testGetAlcoholPercent() {
        assertEquals(7.60, cocktail.getAlcoholPercent(), 0.0001);
    }

    @DisplayName("Testing testGetAlcoholPercentZero() method")
    @Test
    void testGetAlcoholPercentVolumeZero() {
        List<Liquid> liquid= new ArrayList<>();
        liquid.add(new Liquid("Wasser", 0.0, 0));
        Cocktail newCocktail = new Cocktail("Wasser", liquid);

        assertEquals(0.0, newCocktail.getAlcoholPercent());
    }

    @DisplayName("Test testIsAlcoholicTrue() method")
    @Test
    void testIsAlcoholicTrue() {
        assertTrue(cocktail.isAlcoholic());
    }

    @DisplayName("Test testIsAlcoholicFalse() method")
    @Test
    void testIsAlcoholicFalse() {
        List<Liquid> liquids = new ArrayList<>();
        liquids.add(new Liquid("Wasser", 0.2, 0));
        liquids.add(new Liquid("Fanta", 0.5, 0));
        Cocktail nonAlcoholic = new Cocktail("WasserFanta", liquids);

        assertFalse(nonAlcoholic.isAlcoholic());
    }

}
