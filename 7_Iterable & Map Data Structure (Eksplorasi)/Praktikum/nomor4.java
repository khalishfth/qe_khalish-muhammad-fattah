import java.util.ArrayList;
import java.util.HashSet;
public class nomor4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 3, 5, 10, 16};
        int[] result = arrayUnique(arr1, arr2);
        System.out.println("Output 1: " + java.util.Arrays.toString(result));

        int[] arr3 = {3, 8};
        int[] arr4 = {2, 8};
        int[] result2 = arrayUnique(arr3, arr4);
        System.out.println("Output 2: " + java.util.Arrays.toString(result2));
    }

    public static int[] arrayUnique(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            if (!set.contains(arr1[i])) {
                list.add(arr1[i]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
