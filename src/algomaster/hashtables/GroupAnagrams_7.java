package algomaster.hashtables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams_7 {

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();

        for (String words: strs){

            char[] chars = words.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!hashMap.containsKey(key)){
                hashMap.put(key, new ArrayList<>());
            }
            hashMap.get(key).add(words);
        }
        return new ArrayList<>(hashMap.values());
    }

    public static void main(String[] args) {

        String[] strs = {"eat", "tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
