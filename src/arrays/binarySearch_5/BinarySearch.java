package arrays.binarySearch_5;

public class BinarySearch {

    public static int findUsingBinarySearch(int[] arr, int element){

        int low = 0;
        int high = arr.length - 1;

        while (low<=high){

            int mid = low + (high - low)/2;

            if (arr[mid] == element){
                return mid;
            }
            else if (arr[mid] < element){
                low = mid + 1;
            }
            else {
                low = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 10, 40 };
        int x = 10;
        System.out.println(findUsingBinarySearch(arr, x));

    }
}
