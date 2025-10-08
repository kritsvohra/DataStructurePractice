package arrays.arrayEasyProblems_7;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueNumberInArray_4 {

    public static void findUniqueNumber(int[] arr){

        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();

        for (int num: arr){
            countMap.put(num, countMap.getOrDefault(num, 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry: countMap.entrySet()){

            if (entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }

    public static void findUniqueNumberApproach2(int[] arr){

        for (int i = 0; i< arr.length; i++){

            int count = 0;
            for (int j = 0; j< arr.length; j++){

                if (arr[i] == arr[j]){
                    count = count + 1;
                }
            }

            if (count == 1){
                System.out.println(arr[i]);
            }
        }


    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 5, 5, 20, 30, 30};
        findUniqueNumber(arr);
        findUniqueNumberApproach2(arr);
    }
}
