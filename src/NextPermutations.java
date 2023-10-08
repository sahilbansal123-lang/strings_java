import java.lang.reflect.Array;
import java.util.*;

public class NextPermutations {

    public static List<Integer> nextPermutation(int N, int arr[]){

        List<Integer> list = new ArrayList<>();

        int idx = -1;
        for (int i = N-2; i >= 0; i--) {
            if (arr[i] < arr[i+1]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            return list;
        }

        for (int i = N-1; i > idx; i--) {
            if (arr[i] > arr[idx]) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        List<Integer> sublist = list.subList(idx + 1, N);
        Collections.reverse(sublist);

        return list;
    }

    public static void main(String[] args) {
        int N = 7;
        int arr[] = {2, 1, 5, 4, 3, 0, 0};

        System.out.println(nextPermutation(N, arr));
    }
}
