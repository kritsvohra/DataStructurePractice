package algomaster.hashtables;

import java.util.HashMap;

public class RansonNote_5 {

    public static boolean checkRansom(String ransomNote, String magazine){

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        for (int i = 0; i<magazine.length(); i++){
            hashMap.put(magazine.charAt(i), hashMap.getOrDefault(magazine.charAt(i), 0)+1);
        }

        for (int j = 0; j<ransomNote.length(); j++){

            if (!hashMap.containsKey(ransomNote.charAt(j)) || hashMap.get(ransomNote.charAt(j))==0){
                return false;
            }

            hashMap.put(ransomNote.charAt(j), hashMap.get(ransomNote.charAt(j))-1);
        }

        return true;
    }

    public static void main(String[] args) {

        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(checkRansom(ransomNote, magazine));

    }
}
