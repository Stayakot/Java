package day13;

public class Task1 {
    public static void main(String[] args) {

        User a = new User("a");
        User b = new User("b");
        User c = new User("c");

        a.sendMessage(b, "Privet");
        a.sendMessage(b, "Poka");
        b.sendMessage(a, "Privet");
        b.sendMessage(a, "Poka");
        b.sendMessage(a, "Privet");
        c.sendMessage(a, "Poka");
        c.sendMessage(a, "Privet");
        c.sendMessage(a, "Poka");
        a.sendMessage(c, "Privet");
        a.sendMessage(c, "Poka");
        a.sendMessage(c, "Poka");
        c.sendMessage(a, "Poka");

        MessageDatabase.showDialog(b, a);
        MessageDatabase.showDialog(c, a);
        MessageDatabase.showDialog(c, b);

    }

}


