package strings.basic_1;

public class CheckTwoStringsEqualOrNot_2 {

    public static boolean checkTwoStringEqualOrNot(String s1, String s2){

        if (s1.length() == s2.length()){

            for (int i = 0; i<s1.length(); i++){
                if (s1.charAt(i) != s2.charAt(i)){
                    System.out.println("Two strings not equal");
                    return false;
                }
            }
        }else {
            System.out.println("Two string not of equal length");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abc";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(checkTwoStringEqualOrNot(s1, s2));
    }
}
