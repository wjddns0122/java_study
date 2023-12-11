package chap09;

class Printer {
	int numOfPapers = 0;
	
	public void print(int amount) {
		System.out.println("출력 할 장수 : " + amount);
			numOfPapers -= amount;
	}
}

public class PrinterTest {

	public static void main(String[] args) {
		Printer demoPrinter = new Printer();
		
		System.out.println("현재 용지 수 : " + demoPrinter.numOfPapers);
		demoPrinter.numOfPapers = 100;
		System.out.println("추가한용지 수 : " + demoPrinter.numOfPapers);
		demoPrinter.print(70);
		System.out.println("남아 있는용지 수 : " + demoPrinter.numOfPapers);
	} 

}
