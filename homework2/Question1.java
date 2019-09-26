/*
    (10 points) We have an integer array the elements of which are initially increasing up
    to some index i, and they are decreasing starting from index i. Let’s call this index the
    peak.
    
    Write an efficient method/function that, given such an array, determines the peak
    index i.
    
    Write a program that inputs the elements of an array (note that the array size is
    not given) and uses your method to output the peak index.
    
    Give big-Oh estimates for the running times of both the method and the whole program.
    Briefly justify your answer.
*/
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Question1 {
    // inputs the elements of an array, and returns it
    private static int[] inputArray() {
        Scanner s = new Scanner(System.in);

        // as the array size is not given, I have decided to use ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(s.hasNextInt()) {
            list.add(s.nextInt());
        }

        // copy the elements of list to arr
        int[] arr = new int[list.size()]; 
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        // return the array
        return arr;
    }
    /*
        big-Oh estimates for the running times of the inputArray method:

        Scanner s = new Scanner(System.in); -> this is constant
        ArrayList<Integer> list = new ArrayList<Integer>(); -> this is constant
        while(s.hasNextInt()) {
            list.add(s.nextInt()); -> it depends on the number of the input elements (it is linear)
        } 
        int[] arr = new int[list.size()]; -> we can assume this is constant

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i); -> again it depends on the number of the input elements (it is linear)
        }
        return arr; -> it is constant

        Therefor -> O(n)

    */
    // efficient method/function, given such an array, determined the peak index i
    private static void getPeak(int[] arr) {
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i-1] < arr[i] && arr[i+1] < arr[i]) {
                System.out.println("The peak index is " + i);
                return;
            }
        }
    }
    /* 
        big-Oh estimates for the running times of the getPeak method:
        As there is a for loop which iterates throw the array -> O(n), n is the size of the array
    */

    public static void main(String[] args) {
        // the integer array which is initially increasing up to the peak and then decreasing
        int[] arr = inputArray();
        getPeak(arr);
    } 
}