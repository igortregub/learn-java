package igortregub.lifo;

public class Node<T> {
    private T item;

    private Node<T> previousNode;

    public Node(T item, Node<T> previousNode) {
        this.item = item;
        this.previousNode = previousNode;
    }

    public T getItem() {
        return item;
    }

    public Node<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node<T> previousNode) {
        this.previousNode = previousNode;
    }
}
