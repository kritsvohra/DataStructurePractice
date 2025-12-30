package algomaster.twoPointers;
public class MergeSortedArray_1 {

    public static void merge(int[] nums1, int m, int[] nums2, int n){

        int k = 0;
        for (int i = m; i<nums1.length; i++){
            nums1[i] = nums2[k];
            k++;
        }

        for (int i = 0; i<m+n; i++){
            for (int j = 0; j<m+n; j++){
                if (nums1[i] < nums1[j]){
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }

        for (int x: nums1){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
