package chap04;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int number;
        
        do {
            System.out.print("양의 정수를 입력하세요: ");
            number = in.nextInt();
            
            if (number > 0 && number % 2 == 0) {
                sum += number;
            }
        } while (number > 0);

        System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
    }
}
