package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue{

    List<Drink> elements = new ArrayList<Drink>();

    public boolean offer(String obj) {
        return false;
    }

    public String poll() {
        return "";
    }

    public Drink remove() {
        if (elements.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        Drink firstDrink = elements.getFirst();
        elements.removeFirst();

        return firstDrink;
    }

    public Drink peek() {
        return elements.isEmpty() ? null : elements.getFirst();
    }

    public String element() {
        return "";
    }
}