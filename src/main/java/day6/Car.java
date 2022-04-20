package day6;


public class Car {

    private String Model;
    private String Color;
    private int Year;

    public void SetModel(String CarModel) {
        if (CarModel.isEmpty()){
            System.out.println("Kakaya-kakaya model'?");
        }else {
            Model = CarModel;}
    }

    public String GetModel() {
        return Model;
    }

    public void SetColor(String CarColor) {
        if (CarColor.isEmpty()){
            System.out.println("Kakoy-kakoy tshet?");
        }else {
            Color = CarColor;}
    }

    public String GetColor() {
        return Color;
    }

    public void setYear(int CarYear) {
        if (CarYear<=0){
            System.out.println("Skolko-skolko??");
        }else {
            Year = CarYear;}
    }

    public int GetYear() {
        return Year;
    }


    public void info(){
        System.out.println("Это автомобиль");
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








