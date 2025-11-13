package strings.medium3;

public class CheckIfStringsAreRotationOfEachOther_4 {

    public static boolean checkIfStringAreRotationOfEachOther(String s1, String s2){

        for (int i = 0; i<s1.length(); i++){

            if (s1.equals(s2)){
                return true;
            }

            s1 = String.valueOf(s1.charAt(s1.length()-1) + s1.substring(0, s1.length()-1));
        }
        return false;
    }

    public static void main(String[] args) {

        String s1 = "abcd";
        String s2 ="cdab";
        System.out.println(checkIfStringAreRotationOfEachOther(s1, s2));
    }
}
