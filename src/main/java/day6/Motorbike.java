package day6;


public class Motorbike {

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


    public void info(){
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear){
        int raznitsa=Year-inputYear;
        {
            if (raznitsa < 0) {
                raznitsa = inputYear - Year;
            }
        }return raznitsa;
    }
}
