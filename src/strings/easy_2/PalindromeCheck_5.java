package strings.easy_2;

import java.util.Arrays;

public class PalindromeCheck_5 {

    public static boolean palindromeCheck(String s){

        String[] newStr = new String[s.length()];
        int k = 0;
        for (int i = s.length()-1; i>=0; i--){
            newStr[k] = String.valueOf(s.charAt(i));
            k++;
        }
        String reversed = String.join("", newStr);

        if (reversed.equals(s)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        String s = "abba";
        System.out.println(palindromeCheck(s));

        StringBuilder str = new StringBuilder(s);
        if (str.reverse().toString()==s){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
