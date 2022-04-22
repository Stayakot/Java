package day11.task1;

public class Task1 {

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10200; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);


        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);



        businessProcess(picker);
        businessProcess(courier);
        System.out.println(warehouse.getCountDeliveredOrders());
        System.out.println(warehouse.getCountPickedOrders());
        System.out.println(warehouse1.getCountPickedOrders());
        System.out.println(warehouse1.getCountDeliveredOrders());
        System.out.println(picker.salary);
        System.out.println(courier.salary);
        System.out.println(picker1.salary);
        System.out.println(courier1.salary);




    }

}



