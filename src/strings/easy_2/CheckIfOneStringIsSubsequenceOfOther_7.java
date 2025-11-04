package strings.easy_2;

import java.util.ArrayList;

public class CheckIfOneStringIsSubsequenceOfOther_7 {

    public static boolean checkOneStringSubsequenceOfOther(String s1, String s2){

       int k = 0;
       for (int i = 0; i<s2.length() && k <s1.length(); i++){

           if (s1.charAt(k)==s2.charAt(i)){
               k++;
           }
       }
       return k == s1.length();
    }

    public static void main(String[] args) {

        String s1 = "AXY";
        String s2 = "ADXCPY";
        System.out.println(checkOneStringSubsequenceOfOther(s1, s2));
    }
}
