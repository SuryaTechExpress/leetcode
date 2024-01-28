package leetcode.easy;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

//        test1
        int[] test1 = {3,2,2,3}; int val1 = 3;
        System.out.println(removeElement(test1,val1));

//        test2
        int[] test2 = {0,1,2,2,3,0,4,2};int val2 = 2;
        System.out.println(removeElement(test2,val2));
    }
    public static int removeElement(int[] nums, int val) {
        if(nums==null && nums.length==0) return 0;

        int uniqueIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[uniqueIndex++] = nums[i];
            }
        }
        return uniqueIndex;
    }
}
