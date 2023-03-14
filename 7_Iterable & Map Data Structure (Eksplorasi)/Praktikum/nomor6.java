import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class nomor6 {
    public static int findMaxSumSubarray(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE, windowSum = 0;

        ArrayList<Integer> windowList = new ArrayList<>();
        Map<Integer, Integer> windowMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowList.add(arr[windowEnd]);
            windowMap.put(arr[windowEnd], windowMap.getOrDefault(arr[windowEnd], 0) + 1);
            windowSum += arr[windowEnd];

            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                int numToRemove = windowList.remove(0);
                windowMap.put(numToRemove, windowMap.get(numToRemove) - 1);
                if (windowMap.get(numToRemove) == 0) {
                    windowMap.remove(numToRemove);
                }
                windowSum -= numToRemove;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
        System.out.println("Output 1: " + findMaxSumSubarray(arr1, k1)); // Output: 9

        int[] arr2 = {2, 3, 4, 1, 5};
        int k2 = 2;
        System.out.println("Output 2: " + findMaxSumSubarray(arr2, k2)); // Output: 7
    }
}
