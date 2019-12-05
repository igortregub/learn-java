package igortregub.lifo;

import java.util.EmptyStackException;

public interface StackInterface {
    void push(int item) throws IndexOutOfBoundsException;

    int pop() throws EmptyStackException;
}
