package leetcode.arrays;

import java.util.Arrays;

public class ValidPalindrome {

    public static boolean checkPalindrome(String s){
        String strLowerCase = s.toLowerCase();
        String alphanumeric = strLowerCase.replaceAll("[^a-z0-9]", "");
        char[] charArr1 = alphanumeric.toCharArray();
        char[] charArr2 = new char[charArr1.length];
        int x = 0;

        for (int i = charArr1.length-1; i>=0; i--){
            charArr2[x] = charArr1[i];
            x++;
        }
        if (Arrays.equals(charArr1, charArr2)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        String str = String.valueOf(s.matches("^[a-z0-9]+$"));
        System.out.println(checkPalindrome(s));
    }
}
