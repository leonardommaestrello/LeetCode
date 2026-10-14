package br.com.leetCode.challenges.numbers;

public class ReverseInteger_Max_Min_IntegerValues {

	
	public int reverseInt(int x) {
		
		int reversed = 0;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		while (x!=0) {
			int lastDigit = x%10;
			x = x/10;
			if (reversed > max/10) return 0;
			if (reversed < min/10) return 0;
			reversed = reversed*10 + lastDigit;
			
		}
		
		return reversed;
	}

	public static void main (String []args) {
		ReverseInteger_Max_Min_IntegerValues rev = new ReverseInteger_Max_Min_IntegerValues();
		
		System.out.println(rev.reverseInt(-123458));
	}
	
}
