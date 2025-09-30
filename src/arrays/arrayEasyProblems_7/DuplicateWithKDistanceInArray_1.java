package arrays.arrayEasyProblems_7;

public class DuplicateWithKDistanceInArray_1 {

    public static boolean duplicateWithKDistance(int[] arr, int k){

        for (int i = 0; i< arr.length; i++){
            for (int j = i+1; j< arr.length; j++){
                if (arr[i] == arr[j]){
                    if ((Math.abs(i-j)) <= k){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 4, 5};
        int k = 3;
        System.out.println(duplicateWithKDistance(arr, k));
    }
}
