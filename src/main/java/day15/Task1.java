package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {
        File file = new File("C:\\JavaMarathon2021\\src\\main\\resources\\shoes.csv");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("C:\\JavaMarathon2021\\src\\main\\resources\\missing_shoes.txt");
        } catch (FileNotFoundException e) {
            System.out.println("\"Файл не найден\"");
        }
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("\"Файл не найден\"");
        }
        while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(";0")){
                    pw.println(line);
                }
            }pw.close();
        }
    }

