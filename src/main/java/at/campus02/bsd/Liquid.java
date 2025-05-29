package at.campus02.bsd;

/**
 * Represents an ingredient for a drink.
 */
public class Liquid {

    private String name;

    // volume in liter
    private double volume;

    private double alcoholPercent;

    /**
     * Constructor for a liquid.
     * @param name represents the name of the liquid
     * @param volume represents the volume amount of the liquid
     * @param alcoholPercent represents the alcohol amount of the liquid
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Returns the name of the liquid.
     * @return a string with the name of the liquid
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of an existing liquid object.
     * @param name the new name to be stored
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the volume of the liquid.
     * @return a double representing the volume in liter
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the volume of an existing liquid object.
     * @param volume the new volume to be stored
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Returns the alcohol percentage of the liquid.
     * @return a double representing the alcohol percentage of the liquid
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    /**
     * Sets the alcohol percentage of an existing liquid object.
     * @param alcoholPercent the new percentage to be stored
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
