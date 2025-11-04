package strings.easy_2;

import java.util.ArrayList;

public class CamelCaseOfGivenSentence_2 {

    public static String camelCase(String str){

        StringBuilder stringBuilder = new StringBuilder();
        boolean capitalizeNextChar = false;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i)==' '){
                capitalizeNextChar = true;
            }

            else if (capitalizeNextChar == true){
                stringBuilder.append(Character.toUpperCase(str.charAt(i)));
                capitalizeNextChar = false;
            }
            else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        String str = "i got intern at geeksforgeeks";
        System.out.println(camelCase(str));

    }
}
