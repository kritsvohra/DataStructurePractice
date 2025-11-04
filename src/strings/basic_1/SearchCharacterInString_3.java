package strings.basic_1;

public class SearchCharacterInString_3 {

    public static int searchCharInString(String str, char ch){

        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i)==ch){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String s = "geeksforgeeks";
        char ch = 'k';

        System.out.println("First index ::"+s.indexOf(ch));
        System.out.println("Last index ::"+s.lastIndexOf(ch));
        System.out.println("Index from::"+s.indexOf(ch, 5));
        System.out.println(searchCharInString(s, ch));
    }
}
