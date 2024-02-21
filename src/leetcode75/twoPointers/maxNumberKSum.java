package leetcode75.twoPointers;

import java.util.Arrays;

public class maxNumberKSum {
    public int maxOperations(int[] nums, int k) {
        int count = 0;

        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            if(nums[left] + nums[right] == k){
                count++;
                left ++;
                right --;
            }else if((nums[left] + nums[right]) > k){
                right--;
            }else{
                left++;
            }
        }

        return count;

    }
}
