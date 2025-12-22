package algomaster.strings;

public class IsSubsequence_1 {

    public static boolean findSubsequence(String s, String t){

        int k = 0;
        for (int i = 0; i<t.length() && k<s.length(); i++){

            if (s.charAt(k)==t.charAt(i)){
                k++;
            }
        }
        return k ==s.length();
    }

    public static void main(String[] args) {

        String s1 ="abc";
        String s2 = "ahbgdc";
        System.out.println(findSubsequence(s1, s2));

    }
}
