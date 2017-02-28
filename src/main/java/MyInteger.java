
public class MyInteger {
	private int iValue;

	public MyInteger(int a) {
		iValue = a;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}

	public boolean isEven() {
		return isEven(iValue);
	}

	public boolean isOdd() {
		return isOdd(iValue);
	}

	public boolean isPrime() {
		return isPrime(iValue);
	}

	public static boolean isEven(int a) {
		if (a % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int a) {
		if (a % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(int a) {
		if (a < 2) {
			return false;
		}
		if (a == 2) {
			return true;
		}
		if (a % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= a; i += 2) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(MyInteger a) {
		return isEven(a.getiValue());
	}

	public static boolean isOdd(MyInteger a) {
		return isOdd(a.getiValue());
	}

	public static boolean isPrime(MyInteger a) {
		return isPrime(a.getiValue());
	}

	public boolean equals(int a){
		
		return a==iValue;
	}
	public boolean equals(MyInteger a){
		return equals(a.getiValue());
	}

}
