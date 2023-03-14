import java.util.*;
public class nomor2 {
    public static void main(String[] args) {
        String input = "76523752";
        int[] result = findUniqueNumbers(input);
        System.out.println("Output 1: " + Arrays.toString(result));

        String input2 = "1122";
        int[] result2 = findUniqueNumbers(input2);
        System.out.println("Output 2: " + Arrays.toString(result2));
    }

    public static int[] findUniqueNumbers(String input) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();
        for (char ch : input.toCharArray()) {
            if (countMap.get(ch) == 1) {
                resultList.add(Character.getNumericValue(ch));
            }
        }

        int[] result = resultList.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
