package test;

import java.util.Scanner;

public class IncreaseArray {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		System.out.println("# B반 202335053 노정운");
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수 10게 입력 >>");
		for (int i = 0; i < numbers.length; i ++) {
			numbers[i] = in.nextInt();
		}
		
		for (int i = 0; i < numbers.length - 1; i ++) {
			for (int j = 0; j < numbers.length -1 -i; j++) {
				if (numbers[j] > numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}	
		}
		System.out.print("결과 >> ");
		for (int i = 0; i < numbers.length; i ++) {
            System.out.print(numbers[i] + " ");
        }
		in.close();
	}

}
