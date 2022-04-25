package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File files = new File("test2");

        try {
            Scanner scanner = new Scanner(files);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        printSumDigits(files);


    }

    static File file = new File("test");

    public static void printSumDigits(File file) {


        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();

            String[] numbersString = line.split(" ");
            int[] numbers = new int[10];
            int counter = 0;


            for (String number : numbersString) {
                numbers[counter++] = Integer.parseInt(number);
            }
            int sum = 0;
            for (int i : numbers) {
                if (counter != 10) {
                    System.out.println("Некорректный входной файл");
                    break;
                } else sum += i;
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }

}



