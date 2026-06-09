package text.section_12;

public class PrimeNumbers {
	public static void main(String[] args) {
		
		boolean[] primeNumber = new boolean[101];
		
		for( int i = 0; i < primeNumber.length ; i++) {
			primeNumber[i] = true;
		}
		
		// 素数判定
		int number = 2;
		while (number < primeNumber.length) {
			for ( int i = number + 1; i < primeNumber.length; i++) {
				if (i % number == 0) {
					primeNumber[i] = false;
				}
			}
			number++;
		}
		
		for ( int i = 2; i < primeNumber.length; i++) {
			if (primeNumber[i])
				System.out.println(i);
		}
	}
}
