package leetcode.easy;

public class SerchInsertionPosition {
    public static void main(String[] args) {
//        test1
        int nums1[] = {1,3,5,6}, target1 = 5;
        System.out.println(searchInsert(nums1,target1));

//        test2
        int nums2[] = {1,3,5,6}, target2 = 2;
        System.out.println(searchInsert(nums2,target2));

//        test3
        int nums3[] = {1,3,5,6}, target3 = 7;
        System.out.println(searchInsert(nums3,target3));
    }
    public static int searchInsert(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) end = mid-1;
            else start = mid+1;
        }
        return start;
    }
}
