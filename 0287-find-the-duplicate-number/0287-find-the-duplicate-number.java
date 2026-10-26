class Solution {
    public int findDuplicate(int[] nums) {
        // Phase 1: Find the intersection point inside the cycle
        int slow = nums[0];
        int fast = nums[nums[0]];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        // Phase 2: Find the cycle entrance (the duplicate)
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}