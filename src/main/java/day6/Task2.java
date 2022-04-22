package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane air = new Airplane("boing", 211, 222, 233);
        air.fillUp(2020);
        air.fillUp(2020);
        System.out.println(air.getFuel());

    }
}

