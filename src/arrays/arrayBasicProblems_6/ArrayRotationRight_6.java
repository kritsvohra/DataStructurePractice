package arrays.arrayBasicProblems_6;

public class ArrayRotationRight_6 {

    public static void rotateArrayRight(int[] arr, int d){

        int x = 0;
        while (x<d){
            int last = arr[arr.length-1];
            for (int i = arr.length-1; i>0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = last;
            x++;
        }

        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 2;
        rotateArrayRight(arr, d);

    }
}
