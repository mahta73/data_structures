/*
    (20 points) Write a program that inputs an array arr of n elements and outputs the
    number of pairs of elements that are in-order. We will call a pair of elements arr[i] and
    arr[j] in-order if i < j and arr[i] < arr[j].
    The running time of your program should be O(n log n). 
    Inefficient solutions will receive partial points.
*/
import java.util.Scanner;

public class Question3 {
    // a method which inputs an array of n elements
    private static int[] getInputs(int n) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + ". element: ");
            arr[i] = s.nextInt();
        }
        // after inputing n elements, close the scanner
        s.close();
        return arr;
    }

    // output the number of pairs of elements that are in-order
    private static void numberOfInOrderPairs(int[] arr, int first_index, int pairs) {
        if (first_index+1 != arr.length) {
            if (arr[first_index] < arr[first_index+1]) {
                pairs++;
            }
            numberOfInOrderPairs(arr, first_index+1, pairs);
        } else 
            System.out.println("The number of pairs is : " + pairs);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size = s.nextInt();
        System.out.println("Size of the array is: " + size);

        int[] arr = getInputs(size);
        numberOfInOrderPairs(arr, 0, 0);
    }
}