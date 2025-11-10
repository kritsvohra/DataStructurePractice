package leetcode.arrays;

import java.util.Arrays;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s){

        String trimmedString = s.trim();
        String[] words = trimmedString.split(" ");
        return words[words.length-1].length();
    }

    public static void main(String[] args) {

        String s = "   fly me   to   the moon ";
        System.out.println(lengthOfLastWord(s));

    }
}
