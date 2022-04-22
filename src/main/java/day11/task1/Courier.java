package day11.task1;

public class Courier implements Worker {

    public int salary;
    public boolean isPayed;
    public Warehouse object;

    public Courier(Warehouse object) {
        this.object = object;
    }


    public int getSalary() {
        return salary;
    }

    public boolean getisPayed() {
        return isPayed;
    }

    public String toString() {
        return "salary:" + salary + " isPayed:" + isPayed;
    }

    public void doWork() {
        salary += 100;
        object.incrementCountDeliveredOrders();
    }

    public void bonus() {
        if (object.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }

        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        }

        salary += 50000;
        isPayed = true;
    }
}

