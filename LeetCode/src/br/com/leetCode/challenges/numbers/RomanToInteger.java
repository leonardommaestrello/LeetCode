package br.com.leetCode.challenges.numbers;

import java.util.HashMap;
import java.util.Map;

/*
 * Convert a roman number to integer 
 * 
 * Se o caracter é menor do que o proximo, entao ele fica negativo. Se for maior do que o proximo, fica positivo.
 * ex.: VI = 6
 * 		IV = 4
 * 
 */


public class RomanToInteger {
	public Integer convertRomanToInteger (String romanNumber) {
		Map<Character, Integer> map =  new HashMap<>();
		map.put('I',1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result = 0;
		
		for (int i=0; i<romanNumber.length(); i++) {
			if ((i+1)>romanNumber.length()-1) {
				result += map.get(romanNumber.charAt(i));
			} else {
				if (map.get(romanNumber.charAt(i))< map.get(romanNumber.charAt(i+1))) {
					result -= map.get(romanNumber.charAt(i));
				} else {
					result += map.get(romanNumber.charAt(i));
				}
			}			
			
		}

		return result;
	}

	public static void main(String args[]) {
		
		RomanToInteger romanToInteger = new RomanToInteger();
		System.out.println(romanToInteger.convertRomanToInteger("XV"));
		System.out.println(romanToInteger.convertRomanToInteger("XIV"));
		System.out.println(romanToInteger.convertRomanToInteger("LVIII"));
		System.out.println(romanToInteger.convertRomanToInteger("MCMXCIV"));
	}

	
}
