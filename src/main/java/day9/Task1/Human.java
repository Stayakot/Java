package day9.Task1;

public class Human {
    public Human(String name) {
        this.name = name;
    }

    String name;

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + name);
    }
}
