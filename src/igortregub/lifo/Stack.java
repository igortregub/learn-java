package igortregub.lifo;

import java.util.EmptyStackException;

public class Stack implements StackInterface {
    private int[] items;

    private int currentItem = -1;

    Stack(int stackSize) {
        items = new int[stackSize];
    }

    @Override
    public void push(int item) throws IndexOutOfBoundsException {
        if (items.length <= currentItem + 1) {
            throw new IndexOutOfBoundsException("Stack is full.");
        }

        items[++currentItem] = item;
    }

    @Override
    public int pop() throws EmptyStackException {
        if (currentItem < 0) {
            throw new EmptyStackException();
        }

        return items[currentItem--];
    }
}
