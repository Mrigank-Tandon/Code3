package com.company.LeetCodeAugustChallenge;
import java.util.*;
public class DetectCapitals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word=sc.next();
        int capital = 0;
        for(char letter : word.toCharArray())
            if(letter >= 'A' && letter <= 'Z')
                capital++;

        System.out.println(capital == word.length() || capital == 0 || capital == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z');
    }
}
