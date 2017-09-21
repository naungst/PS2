package pkgMain;

public class MyInteger {

	private int iValue;

	public MyInteger(int intVal) {
		this.iValue = intVal;
	}

	public int getMyInteger() {
		return iValue;
	}

	public boolean isEven() {
		
		return iValue % 2 == 0;
	}		
	
	public boolean isOdd() {
		
		return iValue % 2 != 0;
	}
	
	public boolean isPrime() {
		for (int i = 2; i < iValue; i++) {
			if (iValue % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	static boolean isEven(int intVal) {
		return intVal % 2 == 0;
	}
	
	static boolean isOdd(int intVal) {
		return intVal % 2 != 0;
	}
	
	static boolean isPrime(int intVal) {
		for (int i = 2; i < intVal; i++) {
			if (intVal % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	static boolean isEven(MyInteger myInt) {
		return myInt.getMyInteger() % 2 == 0;
	}
	
	static boolean isOdd(MyInteger myInt) {
		return myInt.getMyInteger() % 2 != 0;
	}
	
	static boolean isPrime(MyInteger myInt) {
		for (int i = 2; i < myInt.getMyInteger(); i++) {
			if (myInt.getMyInteger() % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isEquals(int intVal) {
		return iValue == intVal;
	}
	
	public boolean isEquals(MyInteger myInt) {
		return this.getMyInteger() == myInt.getMyInteger();
	}
}
