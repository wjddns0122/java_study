package chap09;

public class PrinterTest2 {

	public static void main(String[] args) {
		Printer2 demoPrinter = new Printer2(10);
		demoPrinter.print2(2);
		demoPrinter.print2(20);
		demoPrinter.print2(10);
	}

}

class Printer2 {
	private int numOfPapers = 0;
	
	public void print2(int amount) {
		if (numOfPapers > amount) {
			numOfPapers = numOfPapers - amount;
			System.out.println(amount + "장 출력했습니다. 현재" + numOfPapers + "장 남아 있습니다.");
		} else if (0 < numOfPapers && numOfPapers < amount) {
			numOfPapers = numOfPapers - amount;
			amount = amount + numOfPapers;
			
			System.out.println();
			
			System.out.printf("모두 출력할려면 %d매가 부족합니다. %d장만 출력합니다. \n", (numOfPapers * -1), amount);
		} else {
			System.out.println("용지가 없습니다.");
		}
	}
	
	public Printer2(int numOfPapers) {
		this.numOfPapers += numOfPapers;
	}
}