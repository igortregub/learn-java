package igortregub.lifo;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Stack<T> implements IStack<T> {
    private LinkedList<T> items;

    public Stack() {
        items = new LinkedList<>();
    }

    @Override
    public void push(T item) {
        items.addFirst(item);
    }

    @Override
    public T pop() throws EmptyStackException {
        try {
            return items.getFirst();
        } catch (NoSuchElementException e) {
            EmptyStackException exception = new EmptyStackException();
            exception.initCause(e);

            throw exception;
        }
    }
}
