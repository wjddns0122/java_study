package Chap05;

public class Car {
    private static int numOfCar = 0;
    private static int numOfRedCar = 0;
    private String color;

    public Car(String color) {
        this.color = color;
        numOfCar++;
        if (color.equalsIgnoreCase("red")) {
            numOfRedCar++;
        }
    }

    public static int getNumOfCar() {
        return numOfCar;
    }

    public static int getNumOfRedCar() {
        return numOfRedCar;
    }
}


