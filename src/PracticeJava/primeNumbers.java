package PracticeJava;

public class primeNumbers {

	public static boolean isPrimeNumber(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;

			}
		}

		return true;
	}
	
	public static void getPrimeNumbers(int num) {
		for (int i=2;i<=num;i++) {
			if(isPrimeNumber(i))
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPrimeNumber(4));
		getPrimeNumbers(20);
	}

}
