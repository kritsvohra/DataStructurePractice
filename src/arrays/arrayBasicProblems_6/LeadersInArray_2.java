package arrays.arrayBasicProblems_6;

import java.util.ArrayList;

public class LeadersInArray_2 {

    public static ArrayList<Integer> findLeadersInArray(int[] arr) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    break;
                }

                if (j == arr.length-1) {
                    arrayList.add(arr[i]);
                }
            }
        }

        arrayList.add(arr[arr.length-1]);
        return arrayList;
    }

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 7, 3, 5, 2};
        ArrayList<Integer> result = findLeadersInArray(arr);

        for (int value: result){
            System.out.println(value);
        }
    }
}
