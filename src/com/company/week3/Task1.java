package com.company.week3;
import  java.util.Scanner;

// все отлично!
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("Введите любое целое число: ");
            int num = scan.nextInt();
            array[i] = num;
        }
        for ( i = 0; i < 5; i++) {
           if (array[i] % 2 == 0)
               System.out.println("Число " + array[i] + " - четное");
           else
               System.out.println("Число " +array[i] + " - нечетное");

       }
    }
}
