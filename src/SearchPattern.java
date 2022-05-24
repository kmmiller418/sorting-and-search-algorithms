import java.util.ArrayList;
import java.util.List;

public class SearchPattern {
    public static void testSearch(){
        String s = "batmanandrobinarebat";
        String pat = "bat";
        System.out.println(search(s, pat).toString());
    }

    public static List search(String str, String subStr){
        String concat = subStr + "$" + str;

        int[] zArr = createZArr(concat);
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < zArr.length; i++){
            if(zArr[i] == subStr.length()){
                indices.add(i - subStr.length());
            }
        }

        return indices;
    }

    private static int[] createZArr(String str) {
        int[] Z = new int[str.length()];

        int left = 0;
        int right = 0;

        for (int i = 1; i < str.length(); i++){
            if (i > right) {
                left = right = i;
                while (right < str.length() && str.charAt(right - left) == str.charAt(right)) {
                    right++;
                }

                Z[i] = right - left;
                right--;
            } else {
                int j = i - left;

                if(Z[j] < right - i + 1){
                    Z[i] = Z[j];
                } else {
                    left = i;
                    while( right < str.length() && str.charAt(right - left) == str.charAt(right)){
                        right++;
                    }
                    Z[i] = right - left;
                    right--;
                }
            }
        }
        return Z;
    }
}
