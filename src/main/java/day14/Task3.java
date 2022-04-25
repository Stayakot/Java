package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        System.out.println(parseFileToObjList(file));

    }

    File file = new File("people");

    public static List<Person> parseFileToObjList(File file) {

        List<Person> command = new ArrayList<>();

        try {

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbersString = line.split(" ");

                if (Integer.parseInt(numbersString[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                Person person = new Person(numbersString[0], Integer.parseInt(numbersString[1]));

                command.add(person);

            }
            return command;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

        return null;

    }
}