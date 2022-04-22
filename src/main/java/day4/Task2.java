package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int kolNol = 0;
        int sum = 0;
        for (int b : array) {
            if (b % 10 == 0) {
                kolNol++;
                sum = sum + b;
            }
        }
        System.out.println("количество элементов массива, оканчивающихся на 0: " + kolNol);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sum);


        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("наибольший элемент массива: " + max);

        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i <= min) {
                min = i;
            }
        }
        System.out.println("наименьший элемент массива: " + min);

    }
}





