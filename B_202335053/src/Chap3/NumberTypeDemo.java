package Chap3;

public class NumberTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mach;
		int distance;
		mach = 340;
		distance = mach * 60 * 60;
		System.out.println("소리가 1시간 동안 거리 : " + distance + "m");
		
		double radius;
		double area;
		radius = 10.0;
		area = radius * radius * 3.14;
		System.out.println("반지름이 10.0인 원의 넓이 : " + area);
		
		int a = 3;
		a *= a+1;
		System.out.println(a);
		
		int x = 1, y = 2;
		x++; y--;
		System.out.println(++x / 3 + x * ++y);
		
		int i = 100;
		char c = (char) i;
		System.out.println(c);
	}

}