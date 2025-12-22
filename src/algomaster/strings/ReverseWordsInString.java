package algomaster.strings;

public class ReverseWordsInString {

    public static String reverseWords(String s) {

        String[] strArr = s.trim().split("\\s+");
        String[] reverseString = new String[strArr.length];
        int x = 0;
        for (int i = strArr.length-1; i>=0; i--){
            reverseString[x] = strArr[i];
            x++;
        }

        return String.join(" ", reverseString);
    }

    public static void main(String[] args) {

        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
