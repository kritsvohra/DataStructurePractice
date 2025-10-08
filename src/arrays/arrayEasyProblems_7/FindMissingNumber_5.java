package arrays.arrayEasyProblems_7;

import java.util.Arrays;

public class FindMissingNumber_5 {

    public static int findMissingNumber(int[] arr){

        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j< arr.length; j++){
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){

            if ((i+1)!=arr[i]){
                return (i+1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(findMissingNumber(arr));
    }
}
