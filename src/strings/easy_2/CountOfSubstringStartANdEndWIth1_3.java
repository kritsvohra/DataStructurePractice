package strings.easy_2;

import java.util.ArrayList;

public class CountOfSubstringStartANdEndWIth1_3 {

    public static int countSubstring(String str){

        int count = 0;

        for (int i = 0; i<str.length(); i++){

            if (str.charAt(i) =='1')
            for (int j = i+1; j<str.length(); j++){
                if (str.charAt(j) =='1'){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String str = "00100101";
        System.out.println(countSubstring(str));

    }
}
