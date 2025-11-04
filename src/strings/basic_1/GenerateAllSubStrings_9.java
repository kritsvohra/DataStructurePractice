package strings.basic_1;

import java.util.ArrayList;

public class GenerateAllSubStrings_9 {

    public static ArrayList<String> generateAllSubstrings(String str){
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i<str.length(); i++){
            for (int j = i; j <str.length(); j++){
                arrayList.add(str.substring(i, j+1));
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {

        String str = "abc";
        ArrayList<String> findSubstring = generateAllSubstrings(str);
        for (String i: findSubstring){
            System.out.println(i+" ");
        }
    }
}
