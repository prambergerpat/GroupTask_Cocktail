package at.campus02.bsd;

import java.util.List;

public class Cocktail extends Drink{

    private List<Liquid> incredients;

    /**
     * Creates a Drink object with given name
     *
     * @param name name of the drink
     */
    public Cocktail(String name, List<Liquid> incredients) {
        super(name);
        this.incredients = incredients;
    }

    @Override
    public double getVolume() {
        double volume = 0;
        for (Liquid element : incredients) {
            volume += element.getVolume();
        }
        return volume;
    }

    @Override
    public double getAlcoholPercent() {
        double totalVolume = 0;
        double totalAlcohol = 0;

        for (Liquid element : incredients) {
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

    @Override
    public boolean isAlcoholic() {
        boolean isAlcoholic = false;

        for (Liquid element : incredients) {
            if (element.getAlcoholPercent() != 0.0) {
                isAlcoholic = true;
            }
        }
        return isAlcoholic;
    }
}
