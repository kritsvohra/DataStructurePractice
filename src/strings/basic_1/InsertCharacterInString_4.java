package strings.basic_1;

public class InsertCharacterInString_4 {

    public static String insertChar(String str, char c, int pos){

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i<str.length(); i++){
            if (i == pos){
                stringBuilder.append(c);
            }
            stringBuilder.append(str.charAt(i));

            if (pos > str.length()){
                stringBuilder.append(c);
            }
        }
        System.out.println("New string is "+stringBuilder.toString());
        return stringBuilder.toString();
    }



    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("Geeks");
        String str = "Geeks";
        char c = 'A';
        int pos = 3;
        s.insert(pos, c);
        System.out.println(s);
        String newStr = insertChar(str, c, pos);
        System.out.println(newStr);

    }
}
