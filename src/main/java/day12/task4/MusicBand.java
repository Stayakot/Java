package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    public List<String> members;

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> member) {
        this.members = members;
    }

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        for (String member : band1.getMembers())
            band2.getMembers().add(member);
        band1.getMembers().clear();


    }

    public void printMembers(){
        System.out.println(this.getMembers());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }


}
