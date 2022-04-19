package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.SetModel("Tarantayka");
        car1.SetColor("Red");
        car1.SetYear(2020);

        System.out.println(car1.GetModel());
        System.out.println(car1.GetColor());
        System.out.println(car1.GetYear());
    }
    }
 class Car {

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

            public void SetYear(int CarYear) {
                if (CarYear<=0){
                    System.out.println("Skolko-skolko??");
                }else {
                    Year = CarYear;}
            }

            public int GetYear() {
                return Year;
            }

        }








