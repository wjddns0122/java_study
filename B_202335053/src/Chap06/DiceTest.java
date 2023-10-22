package Chap06;

import java.util.Random;

public class DiceTest {

	public static void main(String[] args) {
		Dice d = new Dice();
		System.out.println("주사위의 숫자 : " + d.roll());
	}

}

class Dice {
	private Random random;
	public Dice() {
		random = new Random();
	}
	public int roll() {
	return 	random.nextInt(6) +1 ;
	}
	
}
