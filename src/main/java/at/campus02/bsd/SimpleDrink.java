package at.campus02.bsd;
/**
 * Class represents a simple drink liquid which can be used in
 * drinks.
 * This class extends {@link Drink} and provides the volume and alcohol content based on the liquid.
 */
public class SimpleDrink extends Drink{
    /**
     * Liquid used for the drink
     */
    protected Liquid l;
    /**
     * Creates a SimpleDrink object with given name and
     * liquid.
     *
     * @param name name of drink
     * @param l liquid  used in the drink
     */
    SimpleDrink(String name, Liquid l){
        super(name);
        this.l = l;
    }

    /**
     * Returns volume of liquid l
     *
     * @return the volume of drink in liters
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    /**
     * Returns alcohol volume percent of liquid l
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }
    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if(l.getAlcoholPercent() > 0){
            return true;
        }
        return false;
    }
}
