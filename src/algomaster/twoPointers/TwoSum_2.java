package algomaster.twoPointers;

public class TwoSum_2 {

    public static int[] twoSum(int[] numbers, int target) {

        int[] arr = new int[2];
        for (int i = 0; i<numbers.length; i++){
            for (int j = i+1; j< numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                if (sum == target){
                    arr[0] = i+1;
                    arr[1] = j+1;
                    return arr;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] twoSum = twoSum(numbers, target);

        for (int n: twoSum){
            System.out.println(n);
        }
    }
}
