package igortregub.lifo;

import java.util.EmptyStackException;

public class Stack<T> implements IStack<T> {
    private Node<T> lastItem;

    @Override
    public void push(T item) {
        lastItem = new Node<>(item, lastItem);
    }

    @Override
    public T pop() throws EmptyStackException {
        if (lastItem == null) {
            throw new EmptyStackException();
        }

        Node<T> current = lastItem;
        lastItem = lastItem.getPreviousNode();

        current.setPreviousNode(null);

        return current.getItem();
    }
}
