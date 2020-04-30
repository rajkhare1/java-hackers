package recursiongoodluck;

public class RecursionGOODLUCK {
	
	// 3 + 2 + 1
	public static int Summation(int n) {
		// Base case : WE ARE AT THE END
		if(n <= 0) {
			return 0; // additive identity property
		// Recursive case: KEEP GOING
		} else {
			// 3 + Summation(2)
			// 3 + 2 + Summation(1)
			// 3 + 2 + 1 + Summation(0)
			// 3 + 2 + 1 + 0 = 6
			return n + Summation(n - 1);
		}
	}

	public static int Factorial(int n) {
		// Base case
		if(n <= 1) {
			return 1;
		} 
		// Recursive case
		else {
			//  Factorial(4) = 4 * Factorial(3)
			// 4 * 3 * Factorial(2)
			// 4 * 3 * 2 * Factorial(1)
			// 4 * 3 * 2 * 1 
			return n * Factorial(n - 1);
		}
	} 
	
	// 5^3 = 5 * 5 * 5 = 5 * 5^2  = 5 * 5 * 5^1 = 5 * 5 * 5 * 5^0 = 5 * 5 * 5 * 1 = 125
	public static int Exponentiation(int n , int p) {
		// Base case
		if(p <= 0) {
			return 1;
		} 
		// Recursive case
		else {
			// 5 * exponentiation( 5, 3)
			// 5 * 5 * exponentiation(5 , 2)
			// 5 * 5 * 5 * exponentiation( 5, 1)
			// 5 * 5 * 5 * 5 * exponentiation (5 , 0)
			// 5 * 5 * 5 * 5 * 1
			 
			return n * Exponentiation(n , p - 1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Summation(3));
		System.out.println(Factorial(4));
        System.out.println(Exponentiation(5 , 4));
	}

}
