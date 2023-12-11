package exam;

public class factorial3 {

	public static void main(String[] args) {
		int result;
		int n;
		
		System.out.println(factorial(0, 5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));
	}
	
	static int factorial(int x, int y) {
		int r = 1;
		if (x <= y) {
			while (x <= y) {
				r *= x;
				x++;
			}
		}
		return r;
	}

}
