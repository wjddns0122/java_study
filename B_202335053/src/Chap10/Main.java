package Chap10;


class ForeignStudent extends Student {
    private String nationality;

    public ForeignStudent(String name, int age, int studentNumber, String nationality) {
        super(name, age, studentNumber);
        this.nationality = nationality;
    }
    

    @Override
    public void show() {
        System.out.println("사람[이름 : " + getName() + ", 나이 : " + getAge() +
                ", 학번 : " + getStudentNumber() + ", 국적 : " + nationality + "]");
    }
}

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("길동이", 22);
        people[1] = new Student("황진이", 23, 100);
        people[2] = new ForeignStudent("Amy", 30, 200, "U.S.A");

        for (Person person : people) {
            person.show();
        }
    }
}