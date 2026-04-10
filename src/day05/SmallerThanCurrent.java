package src.day05;

import java.util.Arrays;

public class SmallerThanCurrent {
    public static void main(String[] args) {
        int[] nums = {2,5,1,1,2,3,3,7};
        int[] arr= smallerNumbersThanCurrent(nums);
        System.out.print(Arrays.toString(arr));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i] && j!=i){
                    count++;
                }
            }
            arr[i] = count;

        }
        return arr;
    }
}
