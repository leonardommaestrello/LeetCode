package br.com.leetCode.challenges.strings;
/**
	 * Write a function to find the longest common prefix string amongst an array of strings.
	If there is no common prefix, return an empty string ""	
	Example 1:
	Input:
	strs = ["apple", "appetite", "application"]
	Output:
	"app"
	
	Example 2:
	Input:
	strs = ["banana", "band", "banner"]
	Output:
	"ban"
	
	Example 3:
	Input:
	strs = ["cat", "dog", "elephant"]
	Output:
	""
	Explanation: There is no common prefix among the input strings.
	
	Constraints:  	1 <= strs.length <= 200   -  0 <= strs[i].length <= 200  - 	strs[i] consists of only lowercase English letters.
*/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        // write your code here
        
        String baseString = strs[0];
        Boolean prefixFound = false;
        
        while (!prefixFound) {
            if (strs[1].startsWith(baseString) && strs[2].startsWith(baseString)) { 
                prefixFound=true;
                return baseString;
            } else {
                
                if (baseString.length()-1 > 0)
                    baseString = baseString.substring(0,baseString.length()-1); 
                else 
                    return "";
            }
        }
        
        return baseString;
    }
    
    public static void main (String [] args) {
        String[] strs = {"banana", "band", "banner"};
        LongestCommonPrefix sol = new LongestCommonPrefix();
        System.out.println("resultado: "+sol.longestCommonPrefix(strs));
    }
}
