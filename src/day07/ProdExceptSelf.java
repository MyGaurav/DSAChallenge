package src.day07;

import java.util.ArrayList;
import java.util.Arrays;

public class ProdExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] arr = productExceptSelf(nums);
        System.out.print(Arrays.toString(arr));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] * nums[i - 1];
        }
        int pro = 1;
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = arr[i] * pro;
            pro *= nums[i];
        }
        return arr;
    }
}