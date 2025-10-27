package arrays.arrayEasyProblems_7;

public class EquilibriumIndex_9 {

    public static int equilibrium(int[] arr){

        int totalSum = 0;
        for (int i = 0; i<arr.length; i++){
            totalSum = totalSum + arr[i];
        }

        int leftSum = 0;
        for (int i = 0; i<arr.length; i++){
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum){
                return i;
            }
            leftSum = leftSum + arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int equ = equilibrium(arr);
        System.out.println(equ);
    }
}
