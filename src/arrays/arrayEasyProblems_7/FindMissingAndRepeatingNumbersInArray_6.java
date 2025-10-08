package arrays.arrayEasyProblems_7;

import java.util.Arrays;

public class FindMissingAndRepeatingNumbersInArray_6 {

    public static void findMissingNumber(int[] arr){

        int repeatingNumber = -1;

        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j< arr.length; j++){

                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted array: "+Arrays.toString(arr));

        for (int i = 1; i<arr.length; i++){
            if (arr[i] == arr[i-1]){
                repeatingNumber = arr[i];
            }
        }

        System.out.println("Repeating number: "+repeatingNumber);
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        findMissingNumber(arr);

    }
}
