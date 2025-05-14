package at.campus02.bsd;

import java.util.NoSuchElementException;

public class DrinkQueue implements IQueue{

    @Override
    public boolean offer(String obj) {
        return false;
    }

    @Override
    public String poll() {
        return "";
    }

    @Override
    public String remove() throws NoSuchElementException {
        try {
            return poll();
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("there's no element any more");
        }
    }

    @Override
    public String peek() {
    }

    @Override
    public String element() {
        return "";
    }
}
