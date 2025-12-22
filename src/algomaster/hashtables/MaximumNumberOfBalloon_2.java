package algomaster.hashtables;

import java.util.HashMap;

public class MaximumNumberOfBalloon_2 {

    public static int maxNumberOfBalloons(String text) {

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i<text.length(); i++){
            hashMap.put(text.charAt(i), hashMap.getOrDefault(text.charAt(i), 0)+1);
        }

        int countB = hashMap.getOrDefault('b', 0);
        int countA = hashMap.getOrDefault('a',0);
        int countL = hashMap.getOrDefault('l',0)/2;
        int countO = hashMap.getOrDefault('o', 0)/2;
        int countN = hashMap.getOrDefault('n', 0);

        return Math.min(countB, Math.min(countA, Math.min(countL, Math.min(countO, countN))));
    }

    public static void main(String[] args) {
        String text = "nlaebolko";
        System.out.println(maxNumberOfBalloons(text));
    }
}
