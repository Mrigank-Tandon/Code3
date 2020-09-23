package com.company.Arrays;

import java.util.*;

public class Twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(Arrays.toString(sumtarget(a, k)));


    }

    private static int[] sumtarget(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
}
}
