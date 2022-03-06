package com.company.week4;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String [] args){
        System.out.println("Из какого Вы города?");
        System.out.println("1.New York");
        System.out.println("2.Moscow");
        System.out.println("3.London");
        System.out.println("Введите цифру вашего города:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Какой кофе Вы хотике заказать?");
        System.out.println("1.Latte");
        System.out.println("2.Capuccino");
        System.out.println("3.Espresso");
        System.out.println("Введите цифру:");
        int m = sc.nextInt();
        // я так и не поняла как имея только два класса: один абстрактный, второй main
        // вызвать методы абстрактного класса и создать объеты кофеен (когда до конца они должны остаться пустыми)
        // при этом не отходя от тз
    }
}

