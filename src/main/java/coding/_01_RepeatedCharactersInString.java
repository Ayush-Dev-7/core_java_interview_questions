package coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _01_RepeatedCharactersInString {
//    Question : Find repeated characters in a given String.
//    Input :  programming
//    Output : r : 2 | m : 2 | g : 2

    public static void main(String[] args) {
        logic("programming");
        logic2("programming");
    }

//    Time Complexity : O(n)  | Space Complexity : O(k)
    private static void logic(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            freq.put(str.charAt(i), freq.getOrDefault(str.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1)
                System.out.println("Character : " + entry.getKey() + " | Frequency : " + entry.getValue());
        }
    }

//    Time Complexity : O(n)  | Space Complexity : O(1)
    private static void logic2(String str) {
        int[] freq = new int[256]; // ASCII size

        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        System.out.println("Repeated characters:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                System.out.println((char) i + " = " + freq[i]);
            }
        }
    }
}