package strings.easy_2;

public class CheckForBinaryString_1 {

    public static boolean checkBinary(String str){

        for (int i = 0; i<str.length(); i++){

            if (str.charAt(i)!='0' || str.charAt(i)!='1'){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "01010101010";
        System.out.println(checkBinary(str));
    }
}
