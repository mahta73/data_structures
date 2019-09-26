public class Node<E> {
    private E element;
    private Node<E> next;

    // constructor
    public Node(E element, Node<E> next) {
        this.element = element;
        this.next = next;
    }

    // accessors
    public E getElement() {
        return this.element;
    }

    public Node<E> getNext() {
        return this.next;
    }

    // mutators
    public void setNext(Node<E> newNext) {
        this.next = newNext;
    }
} 