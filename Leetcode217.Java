class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // Create a HashSet to store unique elements. hashsets cant contain duplicates
        for (int i = 0; i < nums.length; i++) {  // Iterate through the elements in the array.
            if (set.contains(nums[i])) {  // If the HashSet already contains the current element, it's a duplicate.
                return true;
            }
            set.add(nums[i]); // Otherwise, add the current element to the HashSet.
        }
        return false; // If the loop completes without finding duplicates, return false.
    }
}
