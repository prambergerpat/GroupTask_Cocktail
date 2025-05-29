package at.campus02.bsd;

import java.util.List;

/**
 * Represents a cocktail consisting of one or more liquid objects.
 */
public class Cocktail extends Drink{

    private List<Liquid> ingredients;

    /**
     * Constructor for the cocktail object.
     * @param name a simple string representing the name of the cocktail
     * @param ingredients a list of ingredients, which are needed to create the cocktail
     */
    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }

    /**
     * Calculates and returns the total volume of the cocktail.
     * @return the volume as a double
     */
    @Override
    public double getVolume() {
        double volume = 0;
        for (Liquid element : ingredients) {
            volume += element.getVolume();
        }
        return volume;
    }

    /**
     * Calculates and returns the total amount of alcohol percentage of the cocktail.
     * @return the alcohol percentage of the cocktail as a double
     */
    @Override
    public double getAlcoholPercent() {
        double totalVolume = 0;
        double totalAlcohol = 0;

        for (Liquid element : ingredients) {
            double volume = element.getVolume();
            double alcoholPercent = element.getAlcoholPercent();

            double alcoholAmount = volume * alcoholPercent;

            totalVolume += volume;
            totalAlcohol += alcoholAmount;

            if (totalVolume == 0.0) {
                return 0.0;
            }
        }
        return totalAlcohol / totalVolume;
    }

    /**
     * Determines if all ingredients are non-alcoholic or not.
     * @return true if at least one ingredient is alcoholic, false if no ingredient is alcoholic.
     */
    @Override
    public boolean isAlcoholic() {
        for (Liquid element : ingredients) {
            if (element.getAlcoholPercent() != 0.0) {
                return true;
            }
        }
        return false;
    }
}
