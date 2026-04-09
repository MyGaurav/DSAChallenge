package src.day05;

import java.util.Arrays;

public class RunningSumArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1};
        runningSum(nums);
        System.out.print(Arrays.toString(nums));
    }
    public static int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}
