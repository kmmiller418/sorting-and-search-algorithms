public class Sort {
    public static int[] swap(int[] arr, int idx1, int idx2){
        int arr1 = arr[idx1];

        arr[idx1] = arr[idx2];
        arr[idx2] = arr1;

        return arr;
    }
}
