package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int a = c.nextInt();
        int b = c.nextInt();

        if (a > b){
            System.out.println("Некорректный ввод");}

        while (a < b) {
            a++;
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.print(a + " ");

            }
        }
    }
}
