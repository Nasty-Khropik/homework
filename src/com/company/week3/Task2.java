package com.company.week3;
import  java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = scan.nextLine();
        System.out.println("Введите целое число: ");
        int num = scan.nextInt();
        char [] result = word.toCharArray();
        for (int i = 0; i < result.length; i++) {
            result[i] += num;
        }
        String s1 = "Закодированное слово";
        s1 = s1.copyValueOf(result);
        String str = String.format("Исходное сообщение: %s, зашифрованное сообщение: %s, шифр: %d", word, s1, num);
        System.out.println(str);



    }
}
