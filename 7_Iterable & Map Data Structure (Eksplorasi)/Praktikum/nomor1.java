import java.util.*;
public class nomor1 {
    public static void main(String[] args) {
        String[] arr1 = {"kazuya", "jin", "lee"};
        String[] arr2 = {"kazuya", "feng"};

        String[] mergedArray = mergeArrays(arr1, arr2);

        String[] arr3 = {"lee", "jin"};
        String[] arr4 = {"kazuya", "panda"};

        String[] mergedArray2 = mergeArrays(arr3, arr4);

        System.out.println("Output 1: " + Arrays.toString(mergedArray));
        System.out.println("Output 2: " + Arrays.toString(mergedArray2));
    }

    public static String[] mergeArrays(String[] arr1, String[] arr2) {
        List<String> list = new ArrayList<>(Arrays.asList(arr1));
        for (String element : arr2) {
            if (!list.contains(element)) {
                list.add(element);
            }
        }
        String[] mergedArray = new String[list.size()];
        mergedArray = list.toArray(mergedArray);
        return mergedArray;
    }
}
