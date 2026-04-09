package src.day05;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n=3;
        shuffle(nums,n);
        System.out.print(Arrays.toString(nums));
    }
    public static int[] shuffle(int[] nums, int n) {
        int ans[] = new int[n*2];
        int index =0;
        for(int i =0;i<n;i++){
            ans[index++] = nums[i];
            ans[index++] = nums[i + n];
        }
        return ans;
    }
}
