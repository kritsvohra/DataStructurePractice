package strings.basic_1;

public class ConcatenateTwoStrings_7 {

    public static String concatTwoStrings(String s1, String s2){

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i<s1.length(); i++){
            stringBuilder.append(s1.charAt(i));
        }

        for (int i = 0; i<s2.length(); i++){
            stringBuilder.append(s2.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1+s2);
        System.out.println(concatTwoStrings(s1, s2));
    }
}
