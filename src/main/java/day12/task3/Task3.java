package day12.task3;

import java.util.*;

public class Task3 {

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                groupsAfter2000.add(band);
            }

        }
        return groupsAfter2000;
    }

    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Nirvana", 1989);
        MusicBand band2 = new MusicBand("Metallica", 1981);
        MusicBand band3 = new MusicBand("Beatles", 1960);
        MusicBand band4 = new MusicBand("The Heavy", 2007);
        MusicBand band5 = new MusicBand("Black Rebel Motorcycle Club", 1998);
        MusicBand band6 = new MusicBand("The Rapture", 2001);
        MusicBand band7 = new MusicBand("The Black Keys", 2001);
        MusicBand band8 = new MusicBand("Arctic Monkeys", 2002);
        MusicBand band9 = new MusicBand("The Strokes", 1998);
        MusicBand band10 = new MusicBand("The Kills", 2001);

        List<MusicBand> bands = new ArrayList<>();
        bands.add(band1);
        bands.add(band2);
        bands.add(band3);
        bands.add(band4);
        bands.add(band5);
        bands.add(band6);
        bands.add(band7);
        bands.add(band8);
        bands.add(band9);
        bands.add(band10);

        System.out.println(bands);


        Collections.shuffle(bands);
        System.out.println(bands);

        System.out.println(groupsAfter2000(bands));

    }

}


