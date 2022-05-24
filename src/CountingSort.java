import java.util.Arrays;

public class CountingSort {
    public static void testSort(){
        char[] S = {'e', 'd', 's', 'a', 'b'};
        System.out.println("Presort: " + Arrays.toString(S));
        System.out.println("CountSorted: " + countSort(S));
    }

    public static String countSort(char[] arr){
        char[] output = new char[arr.length];

        int[] counts = new int[256];
        for (int i = 0; i < 256; i++){
            counts[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            counts[arr[i]]++;
        }

        for (int i = 1; i <= 255; i++){
            counts[i] += counts[i-1];
        }

        for (int i = arr.length - 1; i >= 0; i--){
            output[counts[arr[i]] - 1] = arr[i];
            counts[arr[i]]--;
        }

        StringBuilder stringB = new StringBuilder();
        for (int i = 0; i < arr.length; ++i){
            stringB.append(output[i]);
        }
        return stringB.toString();
    }
}
