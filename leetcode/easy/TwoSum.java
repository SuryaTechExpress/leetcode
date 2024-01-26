package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(toSum(nums,target)));
    }
    public static int[] toSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        // Build the hash table
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        // Find the complement
        for (int i=0;i<n;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement) && map.get(complement)!=i) {
                return new int[]{i, map.get(complement)};
            }
        }
        return new int[]{};
    }
}
