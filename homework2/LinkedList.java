public class LinkedList<E> {
    // nested class node
    public static class Node<E> {
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

    // instance variables of the linked list
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    // accessors
    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public Node<E> getHead() {
        if (isEmpty()) return null;
        return head;
    }

    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E e) {
        head = new Node<>(e, head);
        /* 
            if the linked list was empty, the new node is both
            the head and tail of the linked list.
        */ 
        if (isEmpty())
            tail = head; 
        size++;    
    }

    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if(isEmpty()) 
            head = newest;
        else 
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    public E removeFirst() {
        if(isEmpty())
            return null;
        E removedElement = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) 
            tail = null;
        return removedElement;
    }
}