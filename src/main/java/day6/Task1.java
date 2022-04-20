package day6;

public class Task1 {
    public static void main(String[] args) {
        Car novayaMasina = new Car();
        novayaMasina.setYear(2000);
       int TachkaYear = novayaMasina.yearDifference(2030);
       novayaMasina.info();
        System.out.println(TachkaYear);

        Motorbike novayaMotorbike = new Motorbike("Kravasanch","blue", 2020);
        int BikeYear= novayaMotorbike.yearDifference(2010);
        novayaMotorbike.info();
        System.out.println(BikeYear);


    }
}
