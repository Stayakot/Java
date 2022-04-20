package day2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int x = c.nextInt();
        if ( x<=4 && x>=1){
            System.out.println("Малоэтажный дом");}
            else if (x>4 && x<8){
                System.out.println("Среднеэтажный дом");}
            else if ( x>=9){
                System.out.println("Многоэтажный дом");}
            else System.out.println("Ошибка ввода");

        }
    }

