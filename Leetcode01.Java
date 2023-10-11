class Solution { //My Original Solution to TwoSum
    public int[] twoSum(int[] nums, int target) {
    
        for(int i = 0; i < nums.length; i++){ //we are going to go through the whole array of integers. the current position will change once the 
        //number are about to add has reached the end of the array. it then circles bad and changes the current position to be the next.

            int numberToAdd = i + 1; //this is the number we are going to be adding to the current integer.

            while(numberToAdd < nums.length){ 
                int total = nums[i] + nums[numberToAdd]; //so the idea here is that we are adding the current node and the next node to see if it equals target which we are about to compare
                if (total == target){ //if the total == target then we just return the array.
                    int[] indices = {i, numberToAdd};
                    return new int[] {indices[0], indices[1]}; //we are returning the positions of i and numberToAdd rather than the actual number itself.
                }
                numberToAdd++; //this is basically moving to the next node. we are comparing current node of [i] to now the the next node of [numberToAdd].
                
            }                                         
           
    }
    return null;
}

}


