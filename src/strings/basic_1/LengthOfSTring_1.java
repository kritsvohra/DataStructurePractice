package strings.basic_1;

public class LengthOfSTring_1 {

    public static void lengthOfString(String str){

        int count = 0;
        for (char c: str.toCharArray()){
            count++;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {

        String str = "GeeksForGeeks";
        System.out.println(str.length());
        lengthOfString(str);
    }
}
