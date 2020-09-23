package com.company.LeetCodeAugustChallenge;

import java.util.Scanner;

public class validpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String S1=s.toLowerCase();
        int i=0;
        String S2="";
        String S3="";
        while(i<S1.length()){
            char ch=S1.charAt(i);
            i++;
            if(((ch>=65)&&(ch<=90))||((ch>=97)&&(ch<=122))||((ch>=48)&&(ch<=57))){
                S3=S3+ch;
            }

        }
        i=0;
        while(i<S1.length()){
            char ch=S1.charAt(i);
            i++;
            if(((ch>=65)&&(ch<=90))||((ch>=97)&&(ch<=122))||((ch>=48)&&(ch<=57))){
                S2=ch+S2;
            }

        }

        if( S3.equals(S2)){
            System.out.println("true");

    }
        else{
            System.out.println("false");
        }

    }
}
