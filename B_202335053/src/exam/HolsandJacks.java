package exam;

import java.util.Scanner;

public class HolsandJacks {
	public static void main(String[] args) {
		
		int math;
		
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		math = in.nextInt();
		
		if(math % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
	}

}
