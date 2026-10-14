package br.com.leetCode.challenges.numbers;


// encontra palindromo sem String - apenas usando integer
public class PalindromeWithoutStrings {

	
	public boolean isPalindrome(int number) {
		
		if (number<0) return false;
		if (number==0) return true;
		
		int originalNumber= number;
		int reversed = 0;
		
		while (number>0) {
			int lastDigit = number%10;
			reversed = reversed *10 + lastDigit;
			number = number/10;
		}
		
		if (originalNumber==reversed) {
			return true;
		}
		
		
		return false;
	}
	
	
	public static void main (String args[]) {
		PalindromeWithoutStrings pal = new PalindromeWithoutStrings();
		System.out.println(pal.isPalindrome(0));
		System.out.println(pal.isPalindrome(-1));
		System.out.println(pal.isPalindrome(123321));
	}
	
}
