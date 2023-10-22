package Chap3;

public class ConverToLowerToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'd'; // 여기에 원하는 문자를 입력하세요 
		
		if(c >= 'a' && c <= 'z') {
			char uppercase = (char)(c - ('a' - 'A'));
			System.out.println("변환 전 : " + c);
			System.out.println("변환 후 : " + uppercase);
		} else {
			System.out.println("입력된 문자가 소문자가 아닙니다");
		}

	}
}
