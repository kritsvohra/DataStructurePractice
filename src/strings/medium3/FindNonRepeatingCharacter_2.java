package strings.medium3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindNonRepeatingCharacter_2 {

    public static char findNonRepeatingCHaracter(String s){

        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }

        for (Map.Entry<Character, Integer> entrySet: hm.entrySet()){
            if (entrySet.getValue()==1){
                return entrySet.getKey();
            }
        }
        return '$';
    }

    public static void main(String[] args) {

        String s = "geeksforgeeks";
        System.out.println(findNonRepeatingCHaracter(s));
    }
}
