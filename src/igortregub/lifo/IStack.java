package igortregub.lifo;

import java.util.EmptyStackException;

public interface IStack<T> {

    void push(T item);

    T pop() throws EmptyStackException;
}
