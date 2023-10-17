class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffledNums = new int[2 * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            shuffledNums[index++] = nums[i];      // First n elements
            shuffledNums[index++] = nums[i + n];  // Last n elements
        }

        return shuffledNums;
    }
}
