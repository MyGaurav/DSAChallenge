package src.day05;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs{
    public static void main(String[] args) {
        int[] nums = {2,5,1,1,2,3,3,7};
        int result = optimizedNumIdenticalPairs(nums);
        System.out.print(result);
    }
    public static int optimizedNumIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            int freq = map.getOrDefault(nums[i],0);
            count += freq;
            map.put(nums[i],freq+1);

        }
        return count;
    }

    public static int numIdenticalPairs(int[] nums) {
            int freq =0;
            for(int i=0;i<nums.length-1;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i] == nums[j]){
                        freq++;
                    }

                }
            }
            return freq;
    }
}
