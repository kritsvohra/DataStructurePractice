package strings.medium3;

import java.util.ArrayList;

public class FindEarliestRepeatingCharacter_2 {

    public static String findEarliestRepeatingChar(String s){

        ArrayList<Character> arrayList = new ArrayList<Character>();

        for (int i = 0; i<s.length(); i++){

            if (arrayList.contains(s.charAt(i))){
                return String.valueOf(s.charAt(i));
            }else {
                arrayList.add(s.charAt(i));
            }
        }
        return "-1";
    }

    public static void main(String[] args) {

        String s = "hello geeks";
        System.out.println(findEarliestRepeatingChar(s));

    }
}
