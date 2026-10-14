package br.com.leetCode.challenges.arrays;
/**
 * Dado um numero de 1 a n, printar:
 * 
 * Se for divisivel por 3, printar Fizz
 * Se for divisivel por 5, printar Buzz
 * Se for divisivel por 3 e 5, printar FizzBuzz
 * 
 */
public class FizzBuzz {
	
	
	public String printArray(int number) {
		String returnedArrayOfString="[ ";
		for (int i=1; i<number+1; i++) {
			if (i%3==0 || i%5==0) {
				if (i%3==0) {
					returnedArrayOfString = returnedArrayOfString + "Fizz";
				}
				
				if (i%5==0) {
					returnedArrayOfString = returnedArrayOfString + "Buzz";
				}
					
				returnedArrayOfString = returnedArrayOfString + " ";
				
			} else {
				returnedArrayOfString = returnedArrayOfString + i + " ";
			}
		}
		returnedArrayOfString = returnedArrayOfString + " ]";
		return returnedArrayOfString;		
	}
	
	
	public static void main(String [] args) {
		FizzBuzz fb = new FizzBuzz();
		System.out.print(fb.printArray(15));
	}

}
