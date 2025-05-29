package at.campus02.bsd;

import at.campus02.bsd.Drink;
import at.campus02.bsd.SimpleDrink;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue{

    List<Drink> elements = new ArrayList<Drink>();

    public boolean offer(SimpleDrink drink) {
        if (drink == null) {
            return false;
        }
        elements.add(drink);
        return true;
    }

    public Drink poll() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.removeFirst();
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

    public Drink element() {
        return elements.getFirst();
    }
}