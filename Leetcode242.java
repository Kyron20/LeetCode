import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.equals(t)){ //basically we are checking if its already sorted. if it is return true;
            return true;
        }
        
        char[] sArray = s.toCharArray(); //make both strings into an array
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray); //sort the arrays
        Arrays.sort(tArray);
        

        return Arrays.equals(sArray,tArray); //compare arrays to see if they are the same

    }
}