package br.com.leetCode.challenges.strings;

/**
 * 
 * Reverte uma String usando space complexity of O(1)
 */
public class ReverseString {
    public char[] reverseString(char[] s) {
        int left = 0;
        int right = s.length -1;
        
        while (right> left) {
            char tmp = s[left];
            tmp = s[right];
            s[right]= s[left];
            s[left] = tmp;
            left++;
            right--;
        }
        
        return s;
    }
    
    public static void main(String [] args) {
    	ReverseString reverseString = new ReverseString();
    	char[] s = {'h','e','l','l','o'};
    	System.out.println(reverseString.reverseString(s));
    }
}