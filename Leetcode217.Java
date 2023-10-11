class SolutionBetter {//This is my solution to Contains Duplicate. It's much better than the below one.
    public boolean containsDuplicate(int[] nums) {
        
        for (int i = 0; i < nums.length - 1; i++) { //this is the first node position
            for (int j = i + 1; j < nums.length; j++) { //this is the second nodes position. its basically just one ahead of the last node. We call this a nested loop.
                if (nums[i] == nums[j]) //we compare to see if they are the same. if not we just continues along the array. We have i++ and j++ already so i will stay in the same position as j continues to it reaches the end then i increases and then so on.
                    return true;
            }
        }
        return false;
    }
}








class SolutionWorse { //This is my solution to Contains Duplicate. This one works on smaller datasets but theres a more efficient way.
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            
             int numberToAdd = i + 1; //this is the number we are going to be adding to the current integer.

            while(numberToAdd < nums.length){ 
                if(nums[i] == nums[numberToAdd]){ //we are checking if the current number and the number we are looking at are the same return true
                    return true;
                }
                numberToAdd++; //if false we just go to the next number.

            }   

        }
       return false; 
    }
    
}


