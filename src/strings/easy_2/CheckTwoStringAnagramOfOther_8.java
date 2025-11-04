package strings.easy_2;

import java.util.Arrays;

public class CheckTwoStringAnagramOfOther_8 {

    public static boolean checkIfTwoStringAnagramOfEachOther(String s1, String s2){

        if (s1.length()!=s2.length()){
            return false;
        }

        char[] charArr1 = s1.toCharArray();
        char[] charArr2 = s2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        return Arrays.equals(charArr1, charArr2);

    }

    public static void main(String[] args) {

        String s1 = "geeks";
        String s2 = "kseeg";
        System.out.println(checkIfTwoStringAnagramOfEachOther(s1, s2));
    }
}
