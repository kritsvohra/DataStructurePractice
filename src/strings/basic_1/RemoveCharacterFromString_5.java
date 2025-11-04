package strings.basic_1;

public class RemoveCharacterFromString_5 {

    public static String removeCharFromString(String str, int pos){

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<str.length(); i++){

            if (i == pos){
                continue;
            }
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        String s = "abcde";
        StringBuilder stringBuilder = new StringBuilder(s);
        int pos = 1;
        System.out.println(removeCharFromString(s, pos));
        System.out.println(stringBuilder.deleteCharAt(1));


    }
}
