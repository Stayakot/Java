package day12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Zaporozhets");
        arrayList.add("BMW");
        arrayList.add("Tesla");
        arrayList.add("Lada");
        arrayList.add("Audi");
        System.out.println(arrayList);
        arrayList.add(3,"Mazda");
        arrayList.remove(0);
        System.out.println(arrayList);
    }
}
