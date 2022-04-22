package day2;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        double x = c.nextDouble();
        double y = 0;
        if (x >= 5) {
            y = (x * x - 10) / (x + 7);
        } else if (x > -3 && x < 4) {
            y = (x + 3) * (x * x - 2);
        } else y = 420.0;
        System.out.println(y);
    }

}