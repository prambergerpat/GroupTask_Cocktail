package at.campus02.bsd;

import java.util.ArrayList;

public class DrinkQueue{

    ArrayList<SimpleDrink> elements = new ArrayList<SimpleDrink>();

    public boolean offer(SimpleDrink drink) {
        if (drink == null) {
            return false;
        }
        elements.add(drink);
        return true;
    }

    public String poll() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.removeFirst().getName();
    }

    public String remove() {
        return "";
    }

    public String peek() {
        return "";
    }

    public String element() {
        return "";
    }
}
