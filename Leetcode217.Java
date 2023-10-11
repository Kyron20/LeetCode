class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);  //sort the array
        for (int i = 0; i < nums.length - 1; i++) { //we use nums.length -1 as we are going to compare the current element with the next element.
                if (nums[i] == nums[i+1]) { //current element is equals to current element +1 (so the next element) then return true. and we do this for all solutions
                    return true; //this all works because we sorted it. because its sorted the only way for their to be a duplicate is for the current element to be the same as the next as they would be together.
                }
        }
        return false;
    }
}

