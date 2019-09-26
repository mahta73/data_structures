public class SelectionSortIteration {
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
           for (int j = 1; j < arr.length; j++) {
               if (arr[j] < arr[minIndex]) {
                   minIndex = j;
               }
           }
           int temp = arr[i];
           arr[i] = arr[minIndex];
           arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1000, 100, 10};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}