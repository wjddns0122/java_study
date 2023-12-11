package expect_final_exam;

class Phone {
    protected String owner;
    Phone(String owner) {
        this.owner = owner;
    }
    void talk() {
        System.out.println(owner + "가 통화 중이다.");
    }
}

class Telephone extends Phone {
    private String when;
    Telephone(String owner, String when) {
        super(owner);
        this.when = when;
    }
    void autoAnswering() {
        System.out.println(owner + "가 없다. " + when + "전화 줄래.");
    }
}

class Smartphone extends Telephone {
    private String game;
    Smartphone(String owner, String game) {
        super(owner,"when");
        this.game = game;
    }
    void playGame() {
        System.out.println(owner + "가 " + game + " 게임을 하는 중이다.");
    }
}

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그") };

        for (Phone phone : phones) {
            if (phone instanceof Smartphone) {
                ((Smartphone) phone).playGame();
            } else if (phone instanceof Telephone) {
                ((Telephone) phone).autoAnswering();
            } else if (phone instanceof Phone) {
                phone.talk();
            }

        }
    }

}

//Phone 클래스:

//owner라는 필드를 가지며, 생성자를 통해 소유자(owner)를 초기화합니다.
//talk 메서드를 통해 통화 중임을 출력합니다.
//Telephone 클래스:
//
//Phone 클래스를 상속하며, 추가로 when 필드를 가집니다.
//생성자를 통해 소유자(owner)와 전화 받을 시간(when)을 초기화합니다.
//autoAnswering 메서드를 통해 전화를 자동으로 받는 상황을 출력합니다.
//Smartphone 클래스:
//
//Telephone 클래스를 상속하며, 추가로 game 필드를 가집니다.
//생성자를 통해 소유자(owner)와 플레이할 게임(game)을 초기화합니다.
//playGame 메서드를 통해 게임을 하는 상황을 출력합니다.
//PhoneTest 클래스:
//
//main 메서드에서 Phone 배열을 생성하고, 각각의 객체를 생성하여 배열에 할당합니다.
//배열을 순회하면서 각 객체가 어떤 타입인지 확인한 후, 해당하는 메서드를 호출합니다.
//instanceof 연산자를 사용하여 객체의 실제 타입을 확인하고, 타입에 맞는 형변환을 수행하여 메서드를 호출합니다.