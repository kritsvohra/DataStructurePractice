package arrays.arrayEasyProblems_7;

public class MaximumSubArraySum_8 {

    public static int findMaxSubArraySum(int[] arr){

        int result = arr[0];

        for (int i = 0; i< arr.length; i++) {

            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum = currentSum + arr[j];

                result = Math.max(result, currentSum);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(findMaxSubArraySum(arr));
    }
}
