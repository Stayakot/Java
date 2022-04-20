package day2;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        double x = c.nextDouble();
        if (x>=5){
            double y = (x*x - 10) / (x+7);
            System.out.println(y);
        }else if (x>-3 && x<=4){
            double y = (x+3)*(x*x-2);
            System.out.println(y);
        }else System.out.println(420.0);


    }
}
