package final_exam;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountCharTest2 {
	public static void main(String[] args) {
	    System.out.println("B반 202335053 노정운");
	    Scanner sc = new Scanner(System.in);

	    while (true) {
	        System.out.print("문자열을 입력하세요 (종료는 end) : ");
	        String word = sc.nextLine();

	        if (word.equals("end")) {
	        	System.out.println("입력 문자열은 end이므로 프로그램을 종료합니다.");
	            break;
	        }

	        Set<Character> processedChars = new HashSet<>();
	        char[] arr = new char[word.length()];

	        System.out.print("입력 문자열은 ");
	        for (int i = 0; i < word.length(); i++) {
	            arr[i] = word.charAt(i);
	            if (!(i == arr.length - 1)) {
	                System.out.print(arr[i] + "");
	            } else {
	                System.out.print(arr[i]);
	            }
	        }
	        System.out.println("이고 길이는 " + arr.length + "입니다.");

	        for (int i = 0; i < word.length(); i++) {
	            char currentChar = word.charAt(i);

	            if (processedChars.contains(currentChar)) {
	                continue;
	            }

	            processedChars.add(currentChar);

	            int count = countChar(word, currentChar);
	            System.out.println(currentChar + " : " + count + "번 포함");
	        }
	    }
	    sc.close();
	}


    public static int countChar(String word, char ch) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
