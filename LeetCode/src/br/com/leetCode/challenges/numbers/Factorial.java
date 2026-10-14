package br.com.leetCode.challenges.numbers;

public class Factorial {

	public int factorial (int x) {
		if (x==0) return 0;
		
		int result =1;
		while (x>1) {
			result = result *x;
			x--;
		}
 		
		return result;
	}
	
	public static void main (String []args ) {
		Factorial fac = new Factorial();
		int x = 5;
		System.out.println("the factorial of "+x+" is "+fac.factorial(x));
	}
	
}
