package com.Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FruitsInBaskets {
    //bruteForce - Approach
    // Approximately O(n2)
    public static int usingBruteForce(int[] fruits) {
        int n = fruits.length;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            HashSet<Integer> basket = new HashSet<>();
            int length = 0;

            for (int j = i; j < n; j++) {
                basket.add(fruits[j]);
                if (basket.size() > 2) {
                    break;
                }
                length++;
            }

            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }

    // Optimized approach
    // O(n + n) TC
    public static int optimizedApproach(int[] fruits) {
        int n = fruits.length, left = 0, right = 0, maxLength = 0;
        Map<Integer, Integer> baskets = new HashMap<>();

        while (right < n) {
            baskets.put(fruits[right], baskets.getOrDefault(fruits[right], 0) + 1);

            if(baskets.size() > 2) {
                while (baskets.size() > 2) {
                    baskets.put(fruits[left], baskets.get(fruits[left]) - 1);
                    if(baskets.get(fruits[left]) == 0) {
                        baskets.remove(fruits[left]);
                    }
                    left++;
                }
            }
            right++;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2};

        System.out.println(usingBruteForce(arr));
        System.out.println(optimizedApproach(arr));
    }
}
