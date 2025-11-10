package leetcode.arrays;

import java.util.Arrays;

public class FindIndexOFFirstOccurrance {

    public static int findIndex(String haystack, String needle){

        char[] haystackCharArr = haystack.toCharArray();
        char[] needleCharArr = needle.toCharArray();

        
        if (needleCharArr.length == 0){
            return 0;
        }

        if (needleCharArr.length > haystackCharArr.length){
            return -1;
        }

        for (int i = 0; i< haystackCharArr.length- needleCharArr.length; i++){

            char[] newArr = new char[needleCharArr.length];
            for (int j = 0; j<needleCharArr.length; j++){
                newArr[j] = haystackCharArr[i+j];
            }

            if (Arrays.equals(newArr, needleCharArr)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(findIndex(haystack, needle));
    }
}
