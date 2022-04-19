package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motik = new Motorbike("Drandylet", "Siniy", 2020);

        System.out.println(motik.GetModel());
        System.out.println(motik.GetColor());
        System.out.println(motik.GetYear());

    }
}
class Motorbike {

    private String Model;
    private String Color;
    private int Year;

    public Motorbike(String Model, String Color, int Year){
        this.Model=Model;
        this.Color=Color;
        this.Year=Year;

    }
    public String GetModel() {
        return Model;
    }
    public String GetColor() {
        return Color;
    }
    public int GetYear() {
        return Year;
    }
}