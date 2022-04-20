package day8;

public class Airplane {
    String Manufacturer;
    int Year;
    int Length;
    int Weight;
    int Fuel = 0;

    public Airplane(String Manufacturer, int Year, int Length, int Weight) {
        this.Manufacturer = Manufacturer;
        this.Year = Year;
        this.Length = Length;
        this.Weight = Weight;
    }

    public void info() {
        System.out.println("Изготовитель: " + Manufacturer +", "+ "год выпуска: " + Year+", "+"длина: " + Length +", "+ "вес: " + Weight +", "+ "количество топлива в баке: " + Fuel);

    }

    public int fillUp(int n) {
        this.Fuel = n + Fuel;
        return Fuel;

    }

    public void SetManufacturer(String AirplaneManufacturer) {
        if (AirplaneManufacturer.isEmpty()) {
            System.out.println("Kakoy-kakoy Manufacturer?");
        } else {
            Manufacturer = AirplaneManufacturer;
        }
    }


    public void setYear(int AirplaneYear) {
        if (AirplaneYear <= 0) {
            System.out.println("Skolko-skolko??");
        } else {
            Year = AirplaneYear;
        }
    }


    public void setLength(int AirplaneLength) {
        if (AirplaneLength <= 0) {
            System.out.println("Skolko-skolko Dlina??");
        } else {
            Year = AirplaneLength;
        }
    }

    public void setWeight(int AirplaneWeight) {
        if (AirplaneWeight <= 0) {
            System.out.println("Skolko-skolko Vesit??");
        } else {
            Year = AirplaneWeight;
        }
    }

    public void setFuel(int AirplaneFuel) {
        if (AirplaneFuel <= 0) {
            System.out.println("Nemnogo Malovato");
        } else {
            Year = AirplaneFuel;
        }
    }

    public int getFuel() {
        return Fuel;
    }

    public String toString(){
        return "Изготовитель: " + Manufacturer +", "+ "год выпуска: " + Year+", "+"длина: " + Length +", "+ "вес: " + Weight +", "+  "количество топлива в баке: " + Fuel;
    }


}
