package arrays.arrayInsertions_2;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertElementAtBeginningOfArray_1 {

    public static int[] insertElement(int[] arr, int n, int element){

        System.out.println("Before inserting");
        for (int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
        System.out.println("After inserting");
        for (int i = n-1; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = element;
        return arr;
    }

    public static void main(String[] args) {

        // Approach 1 using ArrayList
        ArrayList<Integer> intArr = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
        int element = 50;
        intArr.add(0, element);
        for (int i = 0; i<intArr.size(); i++){
            System.out.println(intArr.get(i));
        }
        System.out.println(intArr.toString());

        System.out.println("--------------");

        // Approach 2 using Arrays
        int[] arr = {10, 20, 30, 40, 0};
        int n = arr.length-1;
        int[] result = insertElement(arr, n, element);
        System.out.println(Arrays.toString(result));
    }
}
