package ru.gb.homework_3;

import java.util.Arrays;
import java.util.Random;

public class Homework3 {
    // Домашняя работа №3.

    public static void main(String[] args) {

        // Задание 1
        zeroOne();

        // Задание 2
        oneHundredArray();

        // Задание 3
        lesSixThanSix();

        // Задание 4
        diagonalArray(5);

        // Задание 5
        arrLen(10, 5);

        // Задание 6
        minMaxArr();

    }

    /*
    Задание 1.
    Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
    0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void zeroOne() {

        Random random = new Random();
        int n = random.nextInt(2, 11);
        // Создаем массив псевдослучайной длины
        int[] zero = new int[n];
        // Заполнить массив случайными 0 и 1
        for (int i = 0; i < zero.length; i++) {
            zero[i] = random.nextInt(0, 2);
        }
        System.out.println("Первоначальный маасив: " + Arrays.toString(zero));
        // Поменять местами 0 на 1, 1 на 0
        for (int x = 0; x < zero.length; x++) {
            if (zero[x] == 0) {
                zero[x] = 1;
            } else {
                zero[x] = 0;
            }
        }
        System.out.println("Массив после замены: " + Arrays.toString(zero));
        System.out.println();
    }

    /*
    Задание 2
    Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
    значениями 1 2 3 4 5 6 7 8 … 100;
     */

    public static void oneHundredArray() {
        int[] arrOneHundred = new int[100];
        for (int i = 0; i < arrOneHundred.length; i++) {
            arrOneHundred[i] = i + 1;
        }
        System.out.println("Массив от 1 до 100 " + Arrays.toString(arrOneHundred) + "\n");
    }

    /*
    Задание 3
    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
    умножить на 2;
     */

    public static void lesSixThanSix() {
        int[] lesSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Дан массив: " + Arrays.toString(lesSix));
        for (int i = 0; i < lesSix.length; ++i) {
            if (lesSix[i] < 6) {
                lesSix[i] *= 2;
            }
        }
        System.out.println("Массив после переобразования: " + Arrays.toString(lesSix));
        System.out.println();
    }

    /*
    Задание 4
    Создать квадратный двумерный целочисленный массив (количество строк и столбцов
    одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    (можно только одну из диагоналей, если обе сложно). Определить элементы одной из
    диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
    [1][1], [2][2], …, [n][n];
     */

    public static void diagonalArray(int n) {
   // int n = 5;
    int[][] diagonals = new int[n][n];
        for(int i = 0; i<diagonals.length; ++i) {
        diagonals[i][i] = 1;
        diagonals[i][n - i - 1] = 1;
        for (int j = 0; j < diagonals.length; ++j) {
            System.out.print(diagonals[i][j] + " ");
        }
        System.out.println();
    }
        System.out.println();
   }

   /*
   Задание 5
   Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
   одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    */

    public static int[] arrLen(int len, int initialValue) {

        int[] a = new int[len];
        for (int i = 0; i < a.length; i++) {
            a[i] += initialValue;
        }
        System.out.println(Arrays.toString(a));
        return a;
    }

    /*
    Задание 6
    Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
     */

    public static void minMaxArr() {

        // Создание рандомного массива от 5 до 20
        Random random = new Random();
        int n = random.nextInt(5, 20);
        int[] arr = new int[n];
       // int minValue = arr[0];
       // int maxValue = arr[0];

        // Заполнияем массив рандомом
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        // Находим минимальное число в массиве
        int minValue = arr[0];
        for (int min = 0; min < arr.length; min++) {

            if (minValue >= arr[min]) {
                minValue = arr[min];
            }
        }
        // Находим максимальное число
        int maxValue = arr[0];
        for (int max = 0; max < arr.length; max++) {

            if (arr[max] > maxValue) {
                maxValue = arr[max];
            }
        }
        // Выводим на печать массив, минальное и максимальное число.
        System.out.println();
        System.out.println("Псевдослучайный массив: " + Arrays.toString(arr));
        System.out.println("Минимальный элемент в массиве = " + minValue);
        System.out.println("Максимальный элемент в массиве = " + maxValue);
        System.out.println("----//----//----//----//----//----//----//----//----//-----//----//----");
        System.out.println("ПРОВЕРКА:");
        Arrays.sort(arr);
        System.out.println("Отсортированный массив" + Arrays.toString(arr));
        System.out.println("Минимальный элемент в массиве = " + arr[0]);
        System.out.println("Максимальный элемент в массиве = " + arr[arr.length - 1]);

    }

}
