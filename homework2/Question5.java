/*
    (20 points) Write a method/function that, given the head node of a singly linked list
    of integer elements, satisfies all three points below:
    (a) modifies the list by removing all the nodes with prime elements,
    (b) prints the sizes of the original and modified list,
    (c) returns the head of the modified list.
    Your method may traverse the list only once. You are not allowed to create any nodes.
    Test your method properly by using it in a program. 
    Any code that does not compile will not receive any points.
*/
public class Question5 {
    private static LinkedList<Integer> removePrimes(LinkedList.Node<Integer> head) {
        LinkedList<Integer> modified_list = new LinkedList<>();
        int original_list_size = 0;

        while(head.getNext() != null) {
            original_list_size++;
            if (!isPrime(head.getNext().getElement())) {
                modified_list.addFirst(head.getNext().getElement());
            }
        }

        original_list_size++;
        if (isPrime(head.getNext().getElement())) {
            modified_list.addFirst(head.getNext().getElement());
        }
 
        System.out.println("The size of the original list is " + original_list_size);
        System.out.println("The size of the modified list is " + modified_list.size());

        return modified_list;
    }

    // a method given a number determines if it is prime or not
    private static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0)
                isPrime = false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>;
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addLast(10);
    }
} 