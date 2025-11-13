package strings.medium3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindkthNonRepeatingCharacter_5 {

    public static char findkthNonRepeatingCharacter(String s, int k){

        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            linkedHashMap.put(ch, linkedHashMap.getOrDefault(ch, 0)+1);
        }

        int count = 0;
        for (Map.Entry<Character, Integer> entrySet: linkedHashMap.entrySet()){
            if (entrySet.getValue()==1){
                count = count + 1;

                if (count == k){
                    return entrySet.getKey();
                }
            }
        }
        return '\0';
    }

    public static void main(String[] args) {

        String str = "geeksforgeeks";
        int k = 3;
        System.out.println(findkthNonRepeatingCharacter(str, k));
    }
}
