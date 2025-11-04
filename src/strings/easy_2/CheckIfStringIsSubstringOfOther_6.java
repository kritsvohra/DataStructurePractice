package strings.easy_2;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckIfStringIsSubstringOfOther_6 {

    public static boolean checkIfStringIsSubstringOfOther(String str, String pat){
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i<str.length(); i++){
            for (int j = i; j<str.length(); j++){
                arrayList.add(str.substring(i, j+1));
            }
        }

        for (String item: arrayList){
            if (item.equals(pat)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String str = "geeksforgeeks";
        String pat = "eks";
        System.out.println(checkIfStringIsSubstringOfOther(str, pat));
    }
}
