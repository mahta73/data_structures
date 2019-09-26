public class BinarySearch {
    public static boolean binarySearch(int arr[], int low, int high, int x) {
        if (low < high) {
            int median = (low + high) / 2;
            if (arr[median] == x) {
                return true;
            } else if (arr[median] < x) {
                return binarySearch(arr, low, median-1, x);
            } else {
                return binarySearch(arr, median+1, high, x);
            }
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(binarySearch(arr, 0, 3, 5));
        System.out.println(binarySearch(arr, 0, 3,2));
    }
}