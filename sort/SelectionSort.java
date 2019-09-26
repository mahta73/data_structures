public class SelectionSort {
    private static void selectionSort(int arr[], int low, int high) {
        if (low < high) {
            int minValue = arr[low];
            int minIndex = low;
            for (int i = low; i < high; i++) {
                if (arr[i] < minValue) {
                    minValue = arr[i];
                    minIndex = i;
                }
            }
            int temp = arr[low];
            arr[low] = minValue;
            arr[minIndex] = temp;
            selectionSort(arr, ++low, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1000, 100, 10};
        selectionSort(arr, 0, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}