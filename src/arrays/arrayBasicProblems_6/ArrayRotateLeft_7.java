package arrays.arrayBasicProblems_6;

import java.util.Arrays;

public class ArrayRotateLeft_7 {

    public static void rotateArrayLeft(int[] arr, int d){

        int n = arr.length;
        int x = 0;
        while (x < d){
            int first = arr[0];
            for (int i = 0; i<n-1; i++){
                arr[i] = arr[i+1];
            }
            arr[n-1] = first;
            x++;
        }

        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 2;
        rotateArrayLeft(arr, d);
    }
}
