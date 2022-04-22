package day4;

public class Task1 {
    public static void main(String[] args) {

        int[] x = {9, 8, 4, 9, 50, 1, 2, 3, 3, 6};
        int sum = 0;
        int chetChisla = 0;
        int neChetChisla = 0;
        int kolRav8 = 0;
        int kolRav1 = 0;


        for (int b = 0; b < x.length; b++) {
            if (x[b] % 2 == 0) {
                chetChisla++;
            } else {
                neChetChisla++;
            }
        }

        for (int b = 0; b < x.length; b++) {
            if (x[b] == 8) {
                kolRav8++;
            }
        }

        for (int b = 0; b < x.length; b++) {
            if (x[b] == 1) {
                kolRav1++;
            }
        }
        for (int c = 0; c < x.length; c++) {
            sum = sum + c;
        }

        System.out.println("Длина массива:" + x.length);
        System.out.println("Количество четных чисел:" + chetChisla);
        System.out.println("Количество нечетных чисел:" + neChetChisla);
        System.out.println("Сумма всех элементов массива:" + sum);
        System.out.println("Количество равных 8:" + kolRav8);
        System.out.println("Количество равных 1:" + kolRav1);


    }
}









