package strings.medium3;

public class ValidateIPV4Address_6 {

    private static boolean isValidIPV4(String ip) {

        String[] parts = ip.split("\\.");

        if (parts.length!=4){
            return false;
        }

        for (String part: parts){
            if (part.isEmpty()){
                return false;
            }

            for (char ch: part.toCharArray()){
                if (!Character.isDigit(ch)){
                    return false;
                }
            }

            if (part.length() > 1 && part.charAt(0) == '0'){
                return false;
            }

            int num = Integer.parseInt(part);
            if (num < 0 || num > 255){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String[] testCases = {
                "128.0.0.1",
                "125.16.100.1",
                "125.512.100.1",
                "125.512.100.abc",
                "192.168.01.1",
                "1.1.1.1.",
                "172.16.254.1"
        };

        for (String ip: testCases){
            System.out.println(ip+" -> "+isValidIPV4(ip));
        }
    }
}
