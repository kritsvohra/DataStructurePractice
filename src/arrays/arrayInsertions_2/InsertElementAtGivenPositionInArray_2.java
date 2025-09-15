package arrays.arrayInsertions_2;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertElementAtGivenPositionInArray_2 {

    public static void usingCustomMethod(int[] arr, int element, int pos){

        int n = arr.length-1;

        System.out.println("Before insertion");
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("After insertion");
        for (int i = n; i>=pos; i--){
            arr[i] = arr[i-1];
        }

        arr[pos-1] = element;

        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        // Approach 1
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
        int pos = 2;
        int element = 50;

        System.out.println("Array before insertion");
        for (int i = 0; i< arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        System.out.println("Arrays after insertion");
        arrayList.add(pos-1, element);

        for (int i = 0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        // Approach 2

        int[] arr2 = {10, 20, 30, 40, 0};
        usingCustomMethod(arr2, element, pos);
    }
}
