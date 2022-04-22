package day11.task1;

public class Warehouse {


    public int countPickedOrders;
    public int countDeliveredOrders;

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public void incrementCountDeliveredOrders() {
        countDeliveredOrders++;
    }

    public void incrementCountPickedOrders() {
        countPickedOrders++;
    }

    public String toString() {
        return "countDeliveredOrders:" + countDeliveredOrders + " countPickedOrders:" + countPickedOrders;
    }
}
