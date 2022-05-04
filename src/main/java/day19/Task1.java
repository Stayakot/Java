package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("C:\\JavaMarathon2021\\src\\main\\resources\\dushi.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);

        scanner.useDelimiter("[»«<>…N„“.,:;()?!\"\\s–+]");
        Map<String, Integer> text = new HashMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split("[»«<>…N„“.,:;()?!\"\\s–+]");
            for (String word : words) {
                if (!text.containsKey(word)) {
                    text.put(word, 1);
                } else text.put(word, text.get(word) + 1);
            }
        }
        scanner.close();
        text.remove("");
        System.out.println("Количество Чичиков: " + text.get("Чичиков"));

        text.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(100)
                .forEach(System.out::println);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }

}


