package com.bridgelabs;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        System.out.println("Enter string for permutation: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Results: ");
        permute("",str);
    }

    private static void permute(String prefix, String str) {
        int len = str.length();
        if(len == 0){
            System.out.println(prefix);
        }else {
            for (int i = 0; i < len; i++){
                permute(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1));
            }
        }
    }
}
