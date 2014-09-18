//Stephanie Wooten

package calc;

public class ComplexCalculator {

	private double currentNumber;
	
	// constructor
	public ComplexCalculator(double d) {
		currentNumber = d;
	}
	
	// adds d to current number
	public void add(double d) {
		currentNumber = currentNumber + d;
	}
	
	// subtracts d from current number
	public void subtract(double d) {
		currentNumber = currentNumber - d;
	} 
	
	// multiplies current number by d
	public void multiply(double d) {
		currentNumber = currentNumber * d;
	}
	
	// divides current number by d
	public void divide(double d) {
		currentNumber = currentNumber / d;
	}
	
	// clears current number
	public void clear() {
		currentNumber = 0;
	}
	
	// power()
	public void power(double d) {
		double initialNumber = currentNumber;
		for(int i = 0; i < d - 1; i++){
			currentNumber = currentNumber * initialNumber;
		}
	}
		
	public double getCurrentNumber() {
		return currentNumber;
	}	
	
	public boolean isEven() {
		if(currentNumber%2 == 0)
			return true;
		else
			return false;
	}
	
	public boolean isPrime() {
		for(int i = 2; i < currentNumber; i++){
			if(currentNumber%i == 0)
				return false;
		}
		return true;
	}
	
	
	//////////////////////////////////////////////////
	// EXTRA FUNCTIONS - not needed for full credit //
	
	// isEven()
	// TODO returns true is current number is even, false otherwise
	
	// isPrime()
	// TODO returns true if current number is a prime number, false otherwise
	
	////////////////////////////////////////////////////
	
}
