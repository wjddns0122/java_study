package Chap10;

class Student extends Person {
    private int studentNumber;

    public Student(String name, int age, int studentNumber) {
        super(name, age);
        this.studentNumber = studentNumber;
    }
    
    public int getStudentNumber() {
    	return studentNumber;
    }

    @Override
    public void show() {
        System.out.println("사람[이름 : " + getName() + ", 나이 : " + getAge() + ", 학번 : " + studentNumber + "]");
    }
}
