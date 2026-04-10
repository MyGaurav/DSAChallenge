package src.day05;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index ={0,1,2,2,1};
        int[] arr= createTargetArray(nums,index);
        System.out.print(Arrays.toString(arr));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        int[] target = new int[list.size()];
        for(int i=0;i<list.size();i++){
            target[i]=list.get(i);
        }
        return target;
    }
}
