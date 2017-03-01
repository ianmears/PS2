package myPkg;
import static org.junit.Assert.*;

import org.junit.Test;

import myPkg.MyInteger;

public class TestMyInteger {

	@Test
	public void testIsEven() {
		
		MyInteger a = new MyInteger(20);
		MyInteger b = new MyInteger(15);

		boolean expectedResult = true;

		assertEquals(expectedResult, a.isEven());
		assertEquals(false, b.isEven());

	}

	@Test
	public void testIsOdd() {
		MyInteger a = new MyInteger(15);
		MyInteger b = new MyInteger(16);

		boolean expectedResult = true;

		assertEquals(expectedResult, a.isOdd());
		assertEquals(false, b.isOdd());
	}

	@Test
	public void testIsPrime() {
		MyInteger c = new MyInteger(7);
		MyInteger d = new MyInteger(8);

		boolean expectedResult = true;

		assertEquals(expectedResult, c.isPrime());
		assertEquals(false, d.isPrime());
	}

	@Test
	public void testIsEvenS() {
		boolean expectedResult = true;
		assertEquals(expectedResult, MyInteger.isEven(10));
	}

	@Test
	public void testIsOddS() {
		boolean expectedResult = true;
		assertEquals(expectedResult, MyInteger.isOdd(7));
	}

	@Test
	public void testIsPrimeS() {
		boolean expectedResult = true;
		assertEquals(expectedResult, MyInteger.isPrime(7));
		assertEquals(false, MyInteger.isPrime(10));
		assertEquals(false, MyInteger.isPrime(1));
		assertEquals(true, MyInteger.isPrime(2));
	}

	@Test
	public void testIsEvenM() {
		MyInteger a = new MyInteger(10);
		assertEquals(true, MyInteger.isEven(a));
	}

	@Test
	public void testIsOddM() {
		MyInteger a = new MyInteger(11);
		assertEquals(true, MyInteger.isOdd(a));
	}

	@Test
	public void testIsPrimeM() {
		MyInteger a = new MyInteger(7);
		assertEquals(true, MyInteger.isPrime(a));
	}

	@Test
	public void testIsEqualsS() {
		MyInteger a = new MyInteger(7);
		assertEquals(true, a.equals(7));
	}

	@Test
	public void testIsEqualsM() {
		MyInteger a = new MyInteger(7);
		MyInteger b = new MyInteger(11);
		assertEquals(false, a.equals(b));
	}

}
