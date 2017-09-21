package pkgMain;
import static org.junit.Assert.*;
import org.junit.Test;

public class MyInteger_Test {

	@Test
	public void testIsEven() {
		MyInteger m1 = new MyInteger(732);
		MyInteger m2 = new MyInteger(71);
		assertEquals(true, m1.isEven());
		assertEquals(false, m2.isEven());
	}
	
	@Test
	public void testIsOdd() {
		MyInteger m1 = new MyInteger(732);
		MyInteger m2 = new MyInteger(71);
		assertEquals(false, m1.isOdd());
		assertEquals(true, m2.isOdd());
	}
	
	@Test
	public void testIsPrime() {
		MyInteger m1 = new MyInteger(997);
		MyInteger m2 = new MyInteger(15);
		assertEquals(true, m1.isPrime());
		assertEquals(false, m2.isPrime());
	}
	
	@Test
	public void testIsEvenStatic() {
		assertEquals(true, MyInteger.isEven(6));
		assertEquals(false, MyInteger.isEven(5));
	}
	
	@Test
	public void testIsOddStatic() {
		assertEquals(true, MyInteger.isOdd(7));
		assertEquals(false, MyInteger.isOdd(10));
	}
	
	@Test
	public void testIsPrimeStatic() {
		assertEquals(true, MyInteger.isPrime(643));
		assertEquals(false, MyInteger.isPrime(20));
	}
	
	@Test
	public void testIsEvenMyInteger() {
		assertEquals(true, MyInteger.isEven(new MyInteger(22)));
		assertEquals(false, MyInteger.isEven(new MyInteger(21)));
	}
	
	@Test
	public void testIsOddMyInteger() {
		assertEquals(true, MyInteger.isOdd(new MyInteger(777)));
		assertEquals(false, MyInteger.isOdd(new MyInteger(36)));
	}
	
	@Test
	public void testIsPrimeMyInteger() {
		assertEquals(true, MyInteger.isPrime(new MyInteger(499)));
		assertEquals(false, MyInteger.isPrime(new MyInteger(48)));
	}
	
	@Test
	public void testIsEquals(){
		MyInteger m1 = new MyInteger(8);
		assertEquals(true, m1.isEquals(8));
		assertEquals(false, m1.isEquals(9));
	}
	
	@Test
	public void testIsEqualsMyInt() {
		MyInteger m1 = new MyInteger(8);
		MyInteger m2 = new MyInteger(8);
		MyInteger m3 = new MyInteger(10);
		assertEquals(true, m1.isEquals(m2));
		assertEquals(false, m1.isEquals(m3));
	}
}
