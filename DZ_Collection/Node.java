public class Node<E> {
    private E element;
    private Node nextNode;

    public Node(E element) {
        this.element = element;
        this.nextNode = null;
    }

    public Node(E element, Node nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    public Node() {
        this.element = null;
        this.nextNode = null;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public String toString(){
        return new String("Node");
    }
}
