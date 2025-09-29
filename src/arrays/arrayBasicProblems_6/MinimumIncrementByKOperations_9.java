package arrays.arrayBasicProblems_6;

public class MinimumIncrementByKOperations_9 {

    public static int minIncrement(int[] arr, int n, int k){

        int max = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++){
            max = Math.max(max, arr[i]);
        }

        int result = 0;
        for (int i = 0; i<n; i++){

            if ((max - arr[i])%k != 0){
                return -1;
            }
            else {
                result = result + ((max - arr[i])/k);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {4, 7, 19, 16};
        int n = arr.length;
        int k = 3;
        System.out.println(minIncrement(arr, n, k));

    }
}
