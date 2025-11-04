package strings.basic_1;

public class ReverseAString_8 {

    public static void reverseAString(String s){

        for (int i = s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }

    public static String reverseString(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "abcdef";
        reverseAString(s);
        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println();
        System.out.println(stringBuilder.reverse());
    }
}
