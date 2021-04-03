package Homework.lesson1.HomeWorkApp;

public class HomeWorkApp {

    public static void main(String[] args) {

        checkSumSign();
        compareNumbers();
        printColor();
        printThreeWords();

    }

    public static void compareNumbers() {
        
        int a = 222;
        int b = 2;

        if (a >= b) {
            System.out.println("a >= b");
        }
        else
            System.out.println("a < b");
    }
    public static void checkSumSign() {
        int a = 3;
        int b = 10;

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        }
        else
            System.out.println("Сумма отрицательная");
    }
    public static void printColor() {
        int value = 222;

        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 0 && value<= 100) {
            System.out.println("Желтый");
        }
        else
            System.out.println("Зеленый");
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}

