package exam;

class A{
	void f() {
		B b = new B();
		b.n = 3;
		b.g();
	}
}

public class Test {

	public static void main(String[] args) {
		int i = 100;
		char c = (char) --i;
		System.out.println(c);
	}

}
