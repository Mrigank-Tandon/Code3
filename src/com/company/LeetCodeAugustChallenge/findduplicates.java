package com.company.LeetCodeAugustChallenge;

import java.util.*;

public class findduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i <n ; i++) {
           arr[i]=sc.nextInt();
        }
        System.out.println(finddup(arr));

    }
    private static List<Integer> finddup(int[] arrA) {


        List<Integer>list=new ArrayList<>();

        for (int i = 0; i < arrA.length; i++) {
            //check if element is negative, if yes the we have found the duplicate
            if (arrA[Math.abs(arrA[i])] < 0) {
                System.out.println("Array has duplicates : " + Math.abs(arrA[i]));
            }
            else if(arrA[Math.abs(arrA[i])] == 0){
                arrA[i]=Integer.MIN_VALUE;
            }
                    else {
                arrA[Math.abs(arrA[i])] = arrA[Math.abs(arrA[i])] * -1;
            }
        }
        return list;
    }
//    private static List<Integer> finddup(int[] arr) {
//        List<Integer>list=new ArrayList<>();
//        int slow=arr[0];
//        int fast=arr[0];
//        slow=arr[slow];
//        fast=arr[arr[fast]];
//        while(slow!=fast){
//            slow=arr[slow];
//            fast=arr[arr[fast]];
//        }
//        int a=arr[0];
//        int b=slow;
//        while(a!=b){
//            a=arr[a];
//            b=arr[b];
//        }
//        list.add(a);
//        return list;
//
//
//    }
//    private static List<Integer> finddup(int[] arr) {
//        List<Integer>list=new ArrayList<>();
//        for (int i = 0; i <arr.length ; i++) {
//            int index = arr[i] % arr.length;
//            arr[index] += arr.length;
//        }
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]/arr.length>1){
//                list.add(i);
//            }
//        }
//        return list;
//    }

//    private static List<Integer> finddup(int[] arr) {
//        List<Integer>list=new ArrayList<>();
//        for (int i = 0; i <arr.length ; i++) {
//            arr[arr[i]%arr.length]=arr[arr[i]%arr.length]+arr.length;
//        }
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]>=arr.length*2){
//                list.add(i);
//            }
//        }
//        return list;
//    }
    //{0, 4, 3, 2, 7, 8, 2, 3, 1} for this input its giving [2,3,4] why?

//    private static void finddup(int[] arr) {
//        int size=arr.length;
//
//        for (int i = 0 ;i < size; i++) {
//            if(arr[Math.abs(arr[i])]>=0){
//                arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
//            }
//            else{
//                System.out.println(Math.abs(arr[i]));
//            }
//        }
//
//    }
}
