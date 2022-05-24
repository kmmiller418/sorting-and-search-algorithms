import java.util.Arrays;

public class BubbleSort extends Sort{

    public static void testSort() {
        int[] arr = {4, 1, 3, 9, 7};
        int n = 5;
        System.out.println("Pre-sort: " + Arrays.toString(arr));
        System.out.println("Bubble sorted: " + Arrays.toString(bubbleSort(arr, n)));
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
