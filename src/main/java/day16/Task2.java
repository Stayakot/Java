package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        Random random = new Random();

        File file1 = new File("file1.txt");


        try {
            PrintWriter pw1 = new PrintWriter(file1);


            for (int i = 0; i < 1000; i++) {
                pw1.print(random.nextInt(100) + " ");
            }

            pw1.close();

            Scanner scanner = new Scanner(file1);
            File file2 = new File("file2.txt");
            PrintWriter pw2 = new PrintWriter(file2);


            int sum = 0;
            int counter = 0;

            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            for (String number : numbersString) {
                sum += Integer.parseInt(number);
                counter++;
                if (counter == 20) {
                    pw2.print(sum / 20.0 + " ");
                    counter = 0;
                    sum = 0;
                }
            }
            pw2.close();
            printResult(file2);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");

            double sum2 = 0;
            for (String number : numbersString) {
                sum2 += Double.parseDouble(number);
            }
            System.out.println((int) sum2);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }
}











