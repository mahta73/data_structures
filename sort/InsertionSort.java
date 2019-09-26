public class InsertionSort {
    private static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    int temp = arr[j];
                    arr[j] = min;
                    arr[min_index] = temp;
                    min_index = j;
                }
            }
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int k = arr[i];
            int k_index = i;
            for (int j = i-1; j>=0; j--) {
                if (arr[j] > k) {
                    int temp = arr[j];
                    arr[j] = k;
                    arr[k_index] = temp;
                    k_index = j;
                }
            }
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // selection sort

        int[] arr = {5, 8, 10, 1};
        selectionSort(arr);
        for (int b = 0; b < arr.length; b++) {
            System.out.print(arr[b] + " ");
        }
        System.out.println();

        // insertion sort

        int[] arr2 = {5, 8, 10, 1};
        insertionSort(arr2);
        for (int b = 0; b < arr2.length; b++) {
            System.out.print(arr2[b] + " ");
        }
        System.out.println();

        // bubble sort

        int[] arr3 = {5, 8, 10, 1};
        bubbleSort(arr3);
        for (int b = 0; b < arr3.length; b++) {
            System.out.print(arr3[b] + " ");
        }
        System.out.println();
    }
}