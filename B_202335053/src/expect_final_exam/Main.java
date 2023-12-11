package expect_final_exam;

import java.util.Arrays;

class Book implements Comparable{
    int price;

    Book(int price) {
        this.price = price;
    }

    void print() {
        System.out.println("Book [price="+price+"]");
    }

    @Override
    public int compareTo(Object o) {
        Book book = (Book) o;

        if(this.price < book.price)
            return -1;
        else if (this.price > book.price)
            return 1;
        else
            return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Book[] books = {new Book(15000),new Book(50000),new Book(20000)};

        System.out.println("정렬 전");
        for (Book b : books)
            b.print();

        Arrays.sort(books);

        System.out.println("정렬 후");
        for (Book b : books)
            b.print();
    }
}

//book 클래스:
//
//Comparable 인터페이스를 구현하여 정렬 가능한 클래스로 만듭니다.
//price라는 필드를 가지며, 생성자를 통해 초기화합니다.
//print 메서드를 통해 현재 Book 객체의 정보를 출력합니다.
//compareTo 메서드를 구현하여 정렬 기준을 정의합니다. 여기서는 가격을 기준으로 정렬하도록 구현했습니다.
//Main 클래스:
//
//main 메서드에서 Book 객체 배열을 생성하고 초기화합니다.
//배열을 생성하고 초기화한 후에는 "정렬 전" 메시지와 함께 배열의 각 Book 객체의 정보를 출력합니다.
//Arrays.sort(books)를 사용하여 Book 배열을 가격을 기준으로 오름차순으로 정렬합니다.
//"정렬 후" 메시지와 함께 정렬된 배열의 각 Book 객체의 정보를 출력합니다.
