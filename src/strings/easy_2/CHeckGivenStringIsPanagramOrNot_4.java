package strings.easy_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * A pangram is a sentence containing all letters of the English Alphabet.
 */

public class CHeckGivenStringIsPanagramOrNot_4 {

    public static boolean checkGivenStringIsPanagram(String str){

        String updatedString = str.toLowerCase();
        for (char ch = 'a'; ch <='z'; ch++){
            boolean found = false;

            for(int i = 0; i<updatedString.length(); i++){
                if (ch == str.charAt(i)){
                    found = true;
                    break;
                }
            }
            if (found == false){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(checkGivenStringIsPanagram(s));

    }
}
