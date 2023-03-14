import java.util.*;
public class nomor3 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6};
        int target = 6;
        int[] result = findTwoSum(nums, target);
        System.out.println("Output 1: " + Arrays.toString(result));

        int[] nums2 = {2, 5, 9, 11};
        int target2 = 11;
        int[] result2 = findTwoSum(nums2, target2);
        System.out.println("Output 2: " + Arrays.toString(result2));
    }

    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
