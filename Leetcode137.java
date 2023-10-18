class Solution {
    public int singleNumber(int[] nums) {
        Map <Integer, Integer> frequency = new HashMap <>();

        for (int num: nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1); 
            //getOrDefault is literally used to retrieve a value associated with a specified key in a map. 
            //but it also allows you to specify a default value to return in case the key is not found in the map
            // the defualt avlue we set if its not in the map is 0 so then later we can use it to show how many of that number is in the map(well array orginally).
            //you basically put all the numbers in the map. num is whats going into the map. 
            // 0 is the default value if the "num" that we are on isnt in the map already. and then we increment it by 1 after that. if the number is in the map we dont set it to 0
            // we just increment by 1.
        }

        for (int num: nums) {
            if (frequency.get(num) == 1) { //checks if the frequency if the current number is == 1. it keeps going until it finds it. if it doesnt then it returns -1
                return num;
            }
        }
        return -1;

    }
}