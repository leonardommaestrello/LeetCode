package br.com.leetCode.challenges.numbers;

public class IntegerToRoman {
	public String intToRoman(int num) {
        String [] romanSymbols =  {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] romanNumbers = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        
        String result="";
        
        for (int i=0; i<romanNumbers.length; i++) {
            while (num>=romanNumbers[i]) {
                result += romanSymbols[i];
                num -= romanNumbers[i];
            } 
        }
        
        return result;
    
    }
	
	public static void main (String []args) {
		IntegerToRoman integerToRoman = new IntegerToRoman();
		System.out.println(integerToRoman.intToRoman(58));
		System.out.println(integerToRoman.intToRoman(1994));
		System.out.println(integerToRoman.intToRoman(3));
	}
 
}
