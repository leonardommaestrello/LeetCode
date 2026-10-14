package br.com.leetCode.challenges.numbers;

// Retorna os zeros no final (trailing zeros)

public class TrailingZeros_LowPriorityForStudy {

	public int trailingZeroes(int n) {
        int count = 0;
        int currPowerOfFive = 5;

        while (n >= currPowerOfFive) {
            count += (n / currPowerOfFive);
            currPowerOfFive *= 5;
        }

        return count;
    }
	
}
