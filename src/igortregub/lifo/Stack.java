package igortregub.lifo;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack implements IStack {
    private int minSize = 10;

    private int[] items;

    private int currentItem = -1;

    public Stack() {
        this(10);
    }

    public Stack(int stackSize) {
        items = new int[stackSize];
    }

    @Override
    public void push(int item) throws IndexOutOfBoundsException {
        if (items.length <= currentItem + 1) {
            items = Arrays.copyOf(items, items.length * 2);
        }

        currentItem++;

        items[currentItem] = item;
    }

    @Override
    public int pop() throws EmptyStackException {
        if (currentItem < 0) {
            throw new EmptyStackException();
        }

        if(items.length > currentItem * 2 && items.length > minSize) {
            items = Arrays.copyOf(items, currentItem + 1);
        }

        return items[currentItem--];
    }
}
