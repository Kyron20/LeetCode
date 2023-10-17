class Solution {
    public int reverse(int x) {

        String reversedString = new StringBuilder(Integer.toString(x)).reverse().toString(); //use stringbuilder to convert it to a string then reverse the string.

        if (reversedString.contains("-")) {
            reversedString = reversedString.substring(0, reversedString.length() - 1); // Remove the last character if it's a hyphen
            reversedString = "-" + reversedString;
        }
       
         
        int reversedNumber = 0;
        try {
            reversedNumber = Integer.parseInt(reversedString);
        } catch (NumberFormatException e) { //if the reversed string is greater than the maximum allowed number for int then just return 0.
            
            return 0;
        }
        
        return reversedNumber;



    }
}