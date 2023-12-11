package chap11;

abstract class AbstractClass {
 int i;

 abstract void show();
}

class Concrete extends AbstractClass {
 int j;

 Concrete(int i, int j) {
     this.i = i;
     this.j = j;
 }

 void show() {
     System.out.println("i = " + i + ", j = " + j);
 }
}

public class AbstractTest {
 public static void main(String[] args) {
     Concrete c = new Concrete(100, 50);
     c.show();
 }
}
