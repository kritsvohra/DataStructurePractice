package strings.medium3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class KthNonRepeatingCharacter_3 {

    public static char findkthNonRepeatingCHaracter(String s, int k){

        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
        ArrayList<Character> nonrepeatingList = new ArrayList<Character>();

        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }

        for (Map.Entry<Character, Integer> entrySet: hm.entrySet()){
            if (entrySet.getValue()==1){
                nonrepeatingList.add(entrySet.getKey());
            }
        }

        if (k <=0 || k>nonrepeatingList.size()){
            return '$';
        }
        return nonrepeatingList.get(k-1);
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int k = 3;
        System.out.println(findkthNonRepeatingCHaracter(s, k));
    }
}
