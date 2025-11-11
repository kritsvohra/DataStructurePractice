package leetcode.arrays;

import java.util.HashMap;

public class IsomorphicString {

    public static boolean checkIsomorphic(String s, String t){

        HashMap<Character, Character> hm = new HashMap<Character, Character>();

        for (int i = 0; i<s.length(); i++){

            if (hm.containsKey(s.charAt(i))){

                if (!hm.get(s.charAt(i)).equals(t.charAt(i))){
                    return false;
                }
            }else {

                if (hm.containsValue(t.charAt(i))){
                    return false;
                }
                hm.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.println(checkIsomorphic(s, t));
    }
}
