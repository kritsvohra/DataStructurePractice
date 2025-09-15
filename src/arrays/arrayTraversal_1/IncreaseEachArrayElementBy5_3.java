package arrays.arrayTraversal_1;

import java.util.Arrays;

public class IncreaseEachArrayElementBy5_3 {

    public static int[] increaseEachArrayElement(int[] arr, int n){

        int[] finalArr = new int[arr.length];
        int x = 0;

        for (int i = 0; i< arr.length; i++){
            finalArr[x] = arr[i] + 5;
            x++;
        }
        return finalArr;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int n = 5;
        int[] result = increaseEachArrayElement(arr, n);
        System.out.println(Arrays.toString(result));
    }
}
