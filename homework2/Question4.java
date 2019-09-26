/*
    (15 points) Write a method/function that, given the head node of a singly linked list
    of char elements, prints every second element in the list. 
    You need to write a program to test your method/function. 
    Any code that does not compile will not receive any points.
*/
import java.util.Scanner;

public class Question4 {
    private static void printNext(LinkedList.Node<Character> head) {
        while(head.getNext() != null) {
            System.out.print(head.getElement() + " ");
            head = head.getNext();
        }
        System.out.print(head.getElement() + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // filling the linked list by inputing characters 
        LinkedList<Character> linked_list = new LinkedList<>();
        while(s.hasNext()) 
            linked_list.addFirst(s.next().charAt(0));
        System.out.println();
        printNext(linked_list.getHead());
    }
}