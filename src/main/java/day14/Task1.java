package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File files = new File("test");

        printSumDigits(files);


    }

    static File file = new File("test");

    public static void printSumDigits(File file) {


        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();

            String[] numbersString = line.split(" ");
            if (numbersString.length!=10){
                throw new IllegalArgumentException("некорректный ввод");
            }

            int sum = 0;
            for (String number : numbersString) {
                sum += Integer.parseInt(number);
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }

}



