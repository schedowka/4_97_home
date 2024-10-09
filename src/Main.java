/*
Даны три различных целых числа. Определить, какое из них (первое, второе
или третье):
а) самое большое;
б) самое маленькое;
в) является средним (средним назовем число, которое больше наименьшего из
данных чисел, но меньше наибольшего).

 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи три числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max;
        if (a > b && a > c) {
            max = a;
        } else if (b > c && b > a) {
            max = b;
        } else {
            max = c;
        }
        int min;
        if (a < b && a < c) {
            min = a;
        } else if (b < c && b < a) {
            min = b;
        } else {
            min = c;
        }
        int middle;
        if ((a > b && a < c) || (a > c && a < b)) {
            middle = a;
        } else if ((b > c && b < a) || (b > a && b < c)) {
            middle = b;
        } else {
            middle = c;
        }
        System.out.println("наибольшее число: " + max);
        System.out.println("среднее число наименьшее число: " + middle);
        System.out.println("наименьшее число: " + min);
    }

}







