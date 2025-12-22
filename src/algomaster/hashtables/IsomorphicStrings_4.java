package algomaster.hashtables;

import java.util.HashMap;

public class IsomorphicStrings_4 {

    public static boolean isIsomorphic(String s, String t){

        HashMap<Character, Character> hashMap = new HashMap<Character, Character>();

        for (int i = 0; i<s.length(); i++){

            if (hashMap.containsKey(s.charAt(i))){
                if (!hashMap.get(s.charAt(i)).equals(t.charAt(i))){
                    return false;
                }
            }else {
                if (hashMap.containsValue(t.charAt(i))) {
                    return false;
                }
                hashMap.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s  ="egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}
