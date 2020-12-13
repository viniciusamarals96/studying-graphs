package br.com.vinicius.hackerrank.balancedBrackets;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {

        if(s.length() % 2 != 0)
            return "NO";

        int n = 0;
        while(s.length() != n){
            n = s.length();
            s = s.replace("()","");
            s = s.replace("[]","");
            s = s.replace("{}","");
        }

        if(s.length() == 0)
            return "YES";
        else
            return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        isBalanced("{[(])}");
    }
}