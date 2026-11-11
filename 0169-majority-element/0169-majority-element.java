class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int max = 0; 
        int majority = 0;
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 1; i<nums.length;i++){
            if(nums[i-1] == nums[i]){
                count++;
            }else{
                count = 1;
            }
            

            if(count>max){
                max = count;
                majority = nums[i];
            }

        }
        return majority;
    }

}