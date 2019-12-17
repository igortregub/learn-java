package igortregub.lifo;

import java.util.EmptyStackException;

public class Test {

    public static void main(String[] args) {
        IStack<Integer> stack = new Stack<>();

        try {
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("stack.pop(), expected exception: " + e.toString());
        }

        for (int i = 0; i <= 15; i++) {
            int value = i + 10;

            System.out.println("push item to stack, item value: " + value);
            stack.push(value);
        }

        for (int i = 0; i <= 16; i++) {
            try {
                System.out.println("Get item from stack: " + stack.pop());
            } catch (EmptyStackException e) {
                System.out.println("Unexpected exception with empty stack.");
            }
        }
    }
}
