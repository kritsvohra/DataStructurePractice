package algomaster.strings;

import java.util.Arrays;

public class ValidPalindrome_2 {

    public static boolean isPalindrome(String s){

        String lowerCaseString = s.toLowerCase();
        String updatedString = lowerCaseString.replaceAll("[^a-z0-9]","");
        char[] charArr1 = updatedString.toCharArray();
        char[] charArr2 = new char[charArr1.length];
        int x = 0;

        for (int i = charArr2.length-1; i>=0; i--){
            charArr2[x] = charArr1[i];
            x++;
        }
        if (Arrays.equals(charArr2, charArr1)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }
}
