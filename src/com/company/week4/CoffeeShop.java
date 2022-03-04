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
        sc.close();
        NewYorkCoffeShop drinkNY = new NewYorkCoffeShop("New York");
        MoscowCoffeShop drinkMos = new MoscowCoffeShop("Moscow");
        LondonCoffeShop drinkLon = new LondonCoffeShop("London");
        if (n==1){
            if (m==1){
                drinkNY.makelatte();
            }
            else if (m==2){
                drinkNY.makeCapuccino();
            }
            else if (m==3){
                drinkNY.makeEspresso();
            }
            else {
                System.out.println("Вы ввели неверное число.");
            }
        }
        if (n==2){
            if (m==1){
                drinkMos.makelatte();
            }
            else if (m==2){
                drinkMos.makeCapuccino();
            }
            else if (m==3){
                drinkMos.makeEspresso();
            }
            else {
                System.out.println("Вы ввели неверное число.");
            }
        }
        if (n==3){
            if (m==1){
                drinkLon.makelatte();
            }
            else if (m==2){
                drinkLon.makeCapuccino();
            }
            else if (m==3){
                drinkLon.makeEspresso();
            }
            else {
                System.out.println("Вы ввели неверное число.");
            }
        }

    }
}

