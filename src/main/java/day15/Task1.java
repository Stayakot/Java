package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            File file = new File("C:/JavaMarathon2021/src/main/resources/shoes.csv");


            PrintWriter pw = new PrintWriter("C:/JavaMarathon2021/src/main/resources/missing_shoes.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(";0")) {
                    pw.println(line);
                }
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}

