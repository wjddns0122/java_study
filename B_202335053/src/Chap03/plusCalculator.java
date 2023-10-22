package Chap3;

import java.util.Scanner;

public class plusCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		int number = in.nextInt();
		
		if(number < 0 || number > 999) {
			System.out.println("0부터 999 사이의 숫자를 입력해 주세요");
		} else {
			int sum = 0;
			
			while(number > 0) {
				int digit = number % 10;
				sum += digit;
				number /= 10;
			}
			System.out.println("각 자릿수의 합 = " + sum);
		}
		
		in.close();
	}

}
