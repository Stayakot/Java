package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[12][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = random.nextInt(50);
        }

        int max=0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                sum = sum + array[i][j];

            }
            if (sum > max) {
                max = sum;
            }



            System.out.println();
            System.out.println("Cymma" + sum);


        }
        System.out.println();
        System.out.println("maximum " + max);
    }
}


