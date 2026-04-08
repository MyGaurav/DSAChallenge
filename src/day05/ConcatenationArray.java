package src.day05;

public class ConcatenationArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        Leetcode1929 sol =new Leetcode1929();
        int[] result=sol.getConcatenation(arr);
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
class Leetcode1929 {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans =new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];

        }
        return ans;
    }
}