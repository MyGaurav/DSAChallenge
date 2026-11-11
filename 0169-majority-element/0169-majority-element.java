class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int middle = nums.length / 2;

        for (int num : nums) {
            int count = counts.getOrDefault(num, 0) + 1;
            counts.put(num, count);
            if (count > middle) {
                return num;
            }
        }

        return -1;
    }
}