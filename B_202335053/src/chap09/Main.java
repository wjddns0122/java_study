package chap09;

class Circle {
	final int radius;
	
	public Circle(int radius) {
		this.radius = radius; 
	}
	
	public void show() {
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}
	
	public int getRadius() {
		return radius;
	}
}

class ColoredCircle extends Circle {
	final String color;
	
	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}
	
	public void show() {
		System.out.println("반지름이 " + getRadius() + "인" + color + " 원입니다.");
	}
	
	
}

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		circle.show();
		ColoredCircle coloredCircle = new ColoredCircle(10, "빨간색");
		coloredCircle.show();
	}
}