/*
    (20 points) 
    We have two arrays: B and N. The B array contains elements, such as "b3"
    and "b26" and the N array contains elements like "n3" and "n26". 
    The pair "b4" and "n4" is called a matching pair, while the pair "b10" and "n17" is not. 
    All the elements in N have a unique match from B. 
    But there is a single extra element e in B that doesn’t have any matches in N. 
    
    The input is k, where k = |N|, the elements of B and the elements
    of N. 

    Write an efficient program that receives this input and prints the value e.

    Give a big-Oh estimate for the running time of your program. Briefly justify your
    answer.
*/

public class Question2 {
    // the inputs are |N|, the elements of B and the elements of N
    private static void printE(int sizeOfN, String[] B, String[] N) {
        int[] B_int = convert(B, "b");
        int[] N_int = convert(N, "n");

        for (int i = 0; i <= sizeOfN; i++) {
            boolean isE = true;
            for (int j = 0; j < sizeOfN; j++) {
                if (B_int[i] == N_int[j]) {
                    isE = false;
                    continue;
                }
            }
            if (isE == true)
                System.out.println("the extra int is " + "b" + B_int[i]);
        }

    }

    // getting the integer part of the each string arrays elements
    private static int getInterger(String s, String arrayType) {
        String[] s2 = new String[2];
        if (arrayType == "b") {
            s2 = s.split("b");
        } else if (arrayType == "n") {
            s2 = s.split("n");
        }
        
        return Integer.parseInt(s2[1]);
    }

    // convert the String arrays to the array which are integer and contain the integer
    // part of each string element
    private static int[] convert(String[] arr, String arrayType) {
        int[] int_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int_arr[i] = getInterger(arr[i], arrayType);
        }

        return int_arr;
    }

    public static void main(String[] args) {
        String[] B = {"b1", "b2", "b64" , "b3", "b4"};
        String[] N = {"n1", "n2", "n3", "n4"};
        printE(3, B, N);
    }
}