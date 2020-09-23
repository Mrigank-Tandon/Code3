package com.company.LeetCodeAugustChallenge;

import java.util.Scanner;

public class poweroffour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(isPowerOfFour(n)){
            System.out.println("true");

        }
        else{
            System.out.println("false");
        }

    }
    static double logn(int n, int r)
    {
        return Math.log(n) / Math.log(r);
    }

    static boolean isPowerOfFour(int n)
    {

        if(n == 0)
            return false;
        return Math.floor(logn(n,4))==Math.ceil(logn(n,4));
    }

}
