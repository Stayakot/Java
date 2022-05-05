package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
     System.out.println(parseFileToStringList(file));

    }

    File file = new File("people");

    public static List<String> parseFileToStringList(File file) {

        List<String> command = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbersString = line.split(" ");

                if (Integer.parseInt(numbersString[1]) < 0) {
                    throw new IllegalArgumentException("Некорректный входной файл");
                }
                command.add(line);
            }
            return command;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        return null;

    }
}
