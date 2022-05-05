package day12;

import java.util.ArrayList;

public class Task2 {

    public void numbers(int one, int two, ArrayList<Integer> arrayList) {
        for (int i = one; i <= two; i++) {
            if (i % 2 == 0) {
                arrayList.add(i);
            }
        }

    }

    public static void main(String[] args) {
        Task2 number = new Task2();
        ArrayList<Integer> arrayList = new ArrayList<>();
        number.numbers(0, 30, arrayList);
        number.numbers(300, 350, arrayList);

        System.out.println(arrayList);
    }

}

