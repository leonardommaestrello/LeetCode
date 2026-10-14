package br.com.leetCode.challenges.numbers;

import java.util.HashMap;
import java.util.Map;

public class FindMinimumSingleNumber {
    public int findSingleNumber(int[] nums) {

	    Map<Integer, Integer> map = new HashMap<>();
	
	    for (int i = 0; i < nums.length; i++) {
	
	        if (map.containsKey(nums[i])) {
	            map.put(nums[i], map.get(nums[i]) + 1);
	        } else {
	            map.put(nums[i], 1);
	        }
	    }
	
	    for (int i = 0; i < nums.length; i++) {
	
	        if (map.get(nums[i]) == 1) {
	            return nums[i];
	        }
	    }
	
	    return -1;
    }
    
    public static void main(String []args) {
    	FindMinimumSingleNumber ex = new FindMinimumSingleNumber();
    	int[] numeros = {2,2,1};
    	System.out.println(ex.findSingleNumber(numeros));
    }
}