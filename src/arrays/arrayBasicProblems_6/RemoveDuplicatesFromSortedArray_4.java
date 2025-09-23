package arrays.arrayBasicProblems_6;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray_4 {

    public static HashSet<Integer> removeDuplicatesUsingHashSet(int[] arr){

        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i< arr.length; i++){
            hashSet.add(arr[i]);
        }
        return hashSet;
    }

    public static ArrayList<Integer> removeDuplicatesUsingArrayList(int[] arr){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i< arr.length; i++){

            if (!arrayList.contains(arr[i])){
                arrayList.add(arr[i]);
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        // Approach 1 - Using hashset
        System.out.println(removeDuplicatesUsingHashSet(arr).toString());

        // Approach-2 Using ArrayList
        System.out.println(removeDuplicatesUsingArrayList(arr).toString());
    }
}
