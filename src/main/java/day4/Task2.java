package day4;
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];

        int n = 0;
        int sum = 0;
        int max = 0;
        int min=10000;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        for (int b = 0; b < array.length; b++) {
            if (array[b] % 10 == 0) {
                n++;
            }
        }
        System.out.println(n);

        for (int a = 0; a < array.length - 1; a++) {
            if (array[a] % 10 == 0)
                sum = sum + a;
        }
        System.out.println(sum);


        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }}
            System.out.println("maximum " + max);

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }}
        System.out.println("minimum " + min);



    }
}





