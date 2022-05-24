import java.util.Arrays;

public class QuickSort extends Sort{
    public static void quickSort(int[] arr, int left , int right) {
        if (left < right) {
            int index = partition(arr, left, right);
            quickSort(arr, left, index-1);
            quickSort(arr, index, right);
        }
    }

    public static void testSort() {
        int[] arr  = { 2, 1, 6, 10, 4, 1, 3, 9, 7};
        System.out.println("Pre-sort: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println("Quick sorted: " + Arrays.toString(arr));

    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left+right)/2];
        while(left<= right) {
            while (arr[left] < pivot) {
                left++;
            }

            while (arr[right] > pivot) {
                right--;
            }

            if(left<= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

}