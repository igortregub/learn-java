package igortregub.lifo;

import java.util.EmptyStackException;

public class Test {
    public static void main(String[] args) {
        int stackSize = 10;
        StackInterface stack = new Stack(stackSize);

        try {
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("stack.pop(), expected exception: " + e.toString());
        }

        for (int i = 0; i <= stackSize; i++) {
            int value = i + 10;

            try {
                System.out.println("push item to stack, item value: " + value);
                stack.push(value);

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Expected exception with stack overflow. Value: " + value);
            }
        }

        for (int i = 0; i <= stackSize - 1; i++) {
            try {
                System.out.println("Get item from stack: " + stack.pop());
            } catch (EmptyStackException e) {
                System.out.println("Unexpected exception with empty stack.");
            }
        }
    }
}
