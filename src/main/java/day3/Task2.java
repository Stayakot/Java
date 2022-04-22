package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        Double number1 = c.nextDouble();
        Double number2 = c.nextDouble();
        while (true) {
            System.out.println(number1 / number2);
            number1 = c.nextDouble();
            number2 = c.nextDouble();
            if (number1 == 0 || number2 == 0) {
                break;
            }

        }
    }
}
