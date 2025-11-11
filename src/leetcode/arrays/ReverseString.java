package leetcode.arrays;

import java.util.Arrays;

public class ReverseString {

    public static char[] reverseString(char[] s){

        char[] revStr = new char[s.length];
        int x = 0;
        for (int i = s.length-1; i>=0; i--){
            revStr[x] = s[i];
            x++;
        }
        return revStr;
    }

    public static void main(String[] args) {

        char[] s = {'h','e','l','l','o'};
        System.out.println(Arrays.toString(reverseString(s)));
    }
}
