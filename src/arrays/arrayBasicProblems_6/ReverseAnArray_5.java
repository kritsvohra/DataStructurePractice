package arrays.arrayBasicProblems_6;

public class ReverseAnArray_5 {

    public static void reverseArray(int[] arr){

        for (int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 2, 6, 5};
        reverseArray(arr);
    }
}
