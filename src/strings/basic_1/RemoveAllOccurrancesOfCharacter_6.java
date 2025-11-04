package strings.basic_1;

public class RemoveAllOccurrancesOfCharacter_6 {

    public static String removeAllOccurrances(String str, char ch){

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == ch){
                continue;
            }
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        String s = "geeksforgeeks";
        char c = 'e';
        System.out.println(removeAllOccurrances(s, c));
        System.out.println(s.replace("e", ""));
    }
}
