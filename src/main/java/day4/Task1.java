package day4;

public class Task1 {
    public static void main(String[] args) {

        int[] x = {9, 8, 4, 9, 50, 1, 2, 3, 3, 6};
        int sum = 0;
        int n = 0;
        int m = 0;
        int k = 0;
        int l = 0;


        for (int b = 0; b < x.length; b++) {
            if (x[b] % 2 == 0) {
                n++;
            } else {
                m++;
            }
        }

        for (int b = 0; b < x.length; b++) {
            if (x[b] == 8) {
                k++;
            }}

        for (int b = 0; b < x.length; b++) {
            if (x[b] == 1) {
                k++;
            }}
        for (int c = 0; c < x.length;c++) {
                sum = sum + c;}






            System.out.println("Длина массива:" + x.length);
            System.out.println("Количество четных чисел:" + n);
            System.out.println("Количество нечетных чисел:" + m);
            System.out.println("Сумма всех элементов массива:" + sum);
            System.out.println("Количество равных 8:" + k);
            System.out.println("Количество равных 1:" + l);


        }
    }









