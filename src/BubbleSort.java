import java.util.Arrays;

public class BubbleSort {

    public static void testSort() {
        int[] arr = {4, 1, 3, 9, 7};
        int n = 5;
        System.out.println("Pre-sort: " + Arrays.toString(arr));
        System.out.println("Bubble sorted: " + Arrays.toString(bubbleSort(arr, n)));
    }

    public static int[] swap(int[] arr, int idx1, int idx2){
        int arr1 = arr[idx1];

        arr[idx1] = arr[idx2];
        arr[idx2] = arr1;

        return arr;
    }

    public static int[] bubbleSort(int[] arr, int n){
        boolean sorted = false;

        while(!sorted){
            sorted = true;
            for (int i = 0; i < n-1; i++) {
                if (arr[i] > arr[i + 1]){
                    swap(arr, i, i+1);
                    sorted = false;
                }
            }
        }
        return arr;
    }

}
