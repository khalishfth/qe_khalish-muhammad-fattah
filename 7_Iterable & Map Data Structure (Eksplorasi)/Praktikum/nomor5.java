import java.util.HashMap;
public class nomor5 {
    public static int remove(int[] nums) {
        // Map untuk menyimpan angka yang sudah ditemukan pada array
        HashMap<Integer, Boolean> map = new HashMap<>();
        int count = 0; // Jumlah angka yang tidak memiliki duplikat pada array

        // Melakukan loop pada array
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], true);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 3, 3, 6, 9, 9};
        int[] nums2 = {2, 2, 2, 11};
        System.out.println("Output 1: " + remove(nums1)); // Output: 4
        System.out.println("Output 2: " + remove(nums2)); // Output: 2
    }
}
