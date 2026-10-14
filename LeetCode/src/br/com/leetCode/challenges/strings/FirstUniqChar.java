package br.com.leetCode.challenges.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar<K> {

	public int firstUniqChar(String s) {
		
        for (int i=0; i<s.length(); i++) {
        	if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
        		return i;
        	}
        }
        
        return -1;
    }
	
	// Solução O(n)
	public int firstUniqCharOn(String s) {

	    Map<Character, Integer> map = new HashMap<>();

	    // First pass: count each character
	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);

	        if (map.containsKey(c)) {
	            map.put(c, map.get(c) + 1);
	        } else {
	            map.put(c, 1);
	        }
	    }

	    // Second pass: find the first character that appears once
	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);

	        if (map.get(c) == 1) {
	            return i;
	        }
	    }

	    return -1;
	}

    public static void main(String[] args) {
    	FirstUniqChar solution = new FirstUniqChar();

    	
        System.out.println(solution.firstUniqCharOn("leetcode"));     // 0
        System.out.println(solution.firstUniqCharOn("loveleetcode")); // 2
        System.out.println(solution.firstUniqCharOn("aabb"));         // -1

    }
}
