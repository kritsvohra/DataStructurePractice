package arrays.arrayTraversal_1;

public class TraverseAndPrint_1 {

    public static void main(String[] args) {

        int[] arr = {0, 20, 30, 40, 50};

        // Linear Traversal
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("----------------------");

        // Reverse Traversal
        for (int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }

        System.out.println("---------------");

        int  x = arr.length-1;

        while (x >=0){
            System.out.println(arr[x]);
            x--;
        }
        int[] arr1 = {10, 20, 30, 40, 50};

        System.out.println("-----------------");

        for (int y: arr1){
            System.out.println(y);
        }
    }
}
