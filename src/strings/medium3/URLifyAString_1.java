package strings.medium3;

public class URLifyAString_1 {

    public static String urlifyString(String s){

//        String str = s.replace(" ", "%20");
//        return str;
        StringBuilder str = new StringBuilder();

        for (int i = 0; i<s.length(); i++){

            if (s.charAt(i)==' '){
                str.append("%20");
            }else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {

        String s = "i love programming";
        System.out.println(urlifyString(s));
    }
}
