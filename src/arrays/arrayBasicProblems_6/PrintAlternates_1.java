package arrays.arrayBasicProblems_6;

public class PrintAlternates_1 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        for (int i = 0; i< arr.length; i = i+2){
            System.out.println(arr[i]);
        }
    }
}
