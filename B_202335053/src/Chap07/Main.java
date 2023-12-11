package Chap07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열과 점검할 문자를 입력하세요: ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        String str = inputArray[0];
        char targetChar = inputArray[1].charAt(0);

        int count = countOc(str, targetChar);
        System.out.println("문자열: " + str + ", 포함 문자 " + targetChar + " -> 횟수: " + count);
    }

    public static int countOc(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}
