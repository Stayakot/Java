package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        ;
        int i=0;
        while ( i<5){
            i++;
            Double number1=c.nextDouble();
            Double number2=c.nextDouble();
            if (number1==0 || number2 ==0){
                System.out.println("Деление на 0");
                continue;}
            System.out.println(number1/number2);


        }
    }
}
