package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        boolean result1 = checkSumRange(3,2);
        System.out.println(result1);
        boolean result2 = checkSumRange(10,4);
        System.out.println(result2);
        checkNumber(0);
        boolean result = checkNumberBool(-1);
        System.out.println(result1);
        printCount ("da", 5);
        boolean checkYear = leapYear(2024);
        System.out.println(checkYear);
        array();
        array100();
        arrayOdd();
        table();
        System.out.println(Arrays.toString(last(5,7)));
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 3;
        int b = 4;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 101;

        if (value <=0){
            System.out.println("Красный");
        } else if (value>0 && value<=100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 3;
        int b = 2;

        if (a>=b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSumRange(int a, int b) {
        int sum = a + b;

        if (sum >=10 && sum <=20){
            return true;
        } else {
            return false;
        }
    }

    public static void checkNumber (int a) {
        if (a>=0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkNumberBool (int a) {
        return a < 0;
    }

    public static void printCount (String text ,int count) {
        for (int i = 0; i<count; i++ ){
            System.out.println(text);
        }

    }

    public static boolean leapYear(int y) {
        return y % 400 == 0 || y % 4 == 0 && y % 100 !=0;
    }

    public static void array() {
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i=0; i < arr.length; i++ ) {
            if(arr[i] == 1){
                arr[i] = 0;
            } else  {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void array100() {
        int [] arr = new int [100];
        for (int i = 0; i < arr.length ; i ++){
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arrayOdd() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i < arr.length ; i ++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void table ()  {
        int size = 4;
        int [] [] table = new int[size][size];
        for (int i = 0; i< table.length; i++) {
            for (int j = 0; j< table.length; j++) {
                if ( i == j || i + j == size - 1) {
                    table [i] [j] = 1;
                }
                System.out.print(table[i] [j] + " ");
            }
            System.out.println();
        }
    }

    public static int [] last (int len, int initialValue) {
        int[] arr = new int [len];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}


