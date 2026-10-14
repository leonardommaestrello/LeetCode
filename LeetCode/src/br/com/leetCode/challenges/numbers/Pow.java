package br.com.leetCode.challenges.numbers;

// Calcula o pow x elevado a n -> X to the power of n.
public class Pow {

	public Double pow(int x,int n) {
		
		if (Integer.MIN_VALUE > x || Integer.MAX_VALUE< x) return 0.0;
		
		double result = x;
		
		if (n>0) {
			for (int i=1; i<n; i++) {
				result = result *x;
			}
			return Double.valueOf(result);
		} else if (n<0) {
			for (int i=1; i<Math.abs(n); i++) {
				result = result *x;
			}
			return Double.valueOf(1/(result));
		}
		else {return 1.0;} //(n==0) condition
	}
	
	public static void main(String [] args) {
		Pow pow = new Pow();
		System.out.println(pow.pow(2, 3));
		System.out.println(pow.pow(3, 3));
		System.out.println(pow.pow(2,-2));
		System.out.println(pow.pow(2,0));
		
	}
	
}
