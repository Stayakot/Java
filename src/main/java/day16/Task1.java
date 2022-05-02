package day16;

import javafx.scene.transform.Scale;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test");
        printResult(file);


    }

    File file = new File("test");

    public static void printResult(File file) {


        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int counter = 0;
            for (String number : numbersString) {
                counter = counter + Integer.parseInt(number);

            }
            double avrSum = (double) counter / numbersString.length;
            System.out.printf(avrSum + " --> %.3f", avrSum);


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}

