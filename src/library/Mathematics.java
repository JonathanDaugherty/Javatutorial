package library;

public class Mathematics {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int mult(int a, int b) {
		return a * b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}
	
	public int mod(int a, int b) {
		return a % b;
	}
	
	public int pow(int a, int b) {
		int power = 1;
		for(int i = 0; i < b; i++ ) {
			power *= a;
		}
		return power;
    }
	
	
	public Mathematics(int a, int b) {
		super();
	}
	
	public Mathematics() {
		super();
	}

}
