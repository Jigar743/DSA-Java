package com.Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(solve(arr, 9)));
    }

    public static int[] solve(int[] A, int B){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = A.length;
        int[] arr = new int[2];

        for(int i = 0; i< n; i++){
            if(map.containsKey(B - A[i])){
                arr[0] = map.get(B - A[i]);
                arr[1] = i;
                return arr;
            }else {
                if(map.containsKey(A[i])) continue;
                else map.put(A[i], i);
            }
        }
        return new int[]{};
    }
}
