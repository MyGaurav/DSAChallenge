package src.day05;

public class BuildArray {
    public static void main(String[] args) {
        int[] arr={0,2,1,5,3,4};
        Solution sol =new Solution();
        int[] result=sol.buildArray(arr);
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
// leetcode-1920 done
//  T.C- O(n) S.C- O(n)
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans=new int[n];
        for(int i =0;i<n;i++){
            int temp=nums[i];
            ans[i]=nums[temp];
        }
        return ans;
    }
}