package day8;

public class Task1 {
    public static void main(String[] args) {

        String st="";

//        for (int i=0; i<20000; i++){
//            st+=i+" ";}
//
//            long startTime = System.currentTimeMillis();
//            System.out.println(st);
//            long stopTime = System.currentTimeMillis();
//            System.out.println("Длительность работы, в мс.:" + (stopTime - startTime));
//
//



        StringBuilder sb = new StringBuilder();
        for ( int i=0; i<20000; i++){
            sb.append(i +" ");}

        long startTime = System.currentTimeMillis();
        System.out.println(sb);
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.:" + (stopTime - startTime));
    }

    }

