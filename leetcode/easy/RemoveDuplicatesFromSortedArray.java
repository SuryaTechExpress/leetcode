package leetcode.easy;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
//        Input: nums = [1,1,2]
//        Output: 2, nums = [1,2,_]

//        Input: nums = [0,0,1,1,1,2,2,3,3,4]
//        Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

        int[] nums1 = {1,1,2};
        System.out.println(removeDuplicates(nums1));

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums2));
    }
    public static int removeDuplicates(int[] nums){
        if(nums==null && nums.length==0) return 0;

        int uniqueIndex = 0;

        for (int i=0;i<nums.length;i++){
            if(nums[i]!=nums[uniqueIndex]){
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }
        return uniqueIndex+1;
    }
}
