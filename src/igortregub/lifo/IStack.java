package igortregub.lifo;

import java.util.EmptyStackException;

public interface IStack {

    void push(int item);

    int pop() throws EmptyStackException;
}
