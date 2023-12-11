import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // 정수 입력 받기
        System.out.println("정수 10개를 입력하세요:");
        for (int i = 0; i < 10; i++) {
            System.out.print("정수 #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // 버블 정렬을 사용하여 배열을 정렬
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // 두 원소를 교환
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // 정렬된 배열 출력
        System.out.println("정렬된 숫자:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
