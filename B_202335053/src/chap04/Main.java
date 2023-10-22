package chap04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 0; i < 5; i++) {
		     if ( i % 3 == 0 )
		     continue;
		sum += i;
		}

		System.out.println(sum);
	}
}
