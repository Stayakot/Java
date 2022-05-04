package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        File file = new File("C:\\JavaMarathon2021\\src\\main\\resources\\taxi_cars.txt");

        try {
           Scanner scanner = new Scanner(file);

            Map<Integer, Point> cars = new HashMap<>();
            Scanner numbers = new Scanner(System.in);
            int x1 = numbers.nextInt();
            int y1 = numbers.nextInt();
            int x2 = numbers.nextInt();
            int y2 = numbers.nextInt();
            Point square1 = new Point(x1, y1);
            Point square2 = new Point(x2, y2);


            while (scanner.hasNextLine()) {   //Add all cars to HashMap

                cars.put(scanner.nextInt(), new Point(scanner.nextInt(), scanner.nextInt()));


            }
            int counter = 0;
            for (Map.Entry<Integer, Point> position : cars.entrySet()) {  //Checking cars inside squares

                if (square1.getX() < position.getValue().getX() && position.getValue().getX() < square2.getX() && square1.getY() > position.getValue().getY() && position.getValue().getY() > square2.getY()) {
                    System.out.println("Такси: " + position.getKey() + " находится в квадрате.");
                    counter++;
                }

            }
            System.out.println("Общее количество машин в квадрате: " + counter + ";");

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}

