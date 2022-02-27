package com.company.week4;

import java.util.Scanner;

//мы делаем полноценное приложение. Этот класс можно назвать как-нибудь типа CoffeeShop
public class Task {
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
        
        //зачем здесь создавать новый сканнер если уже есть один (стр. 13)
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        sc.close();
        NewYorkCoffeShop drinkNY = new NewYorkCoffeShop();
        MoscowCoffeShop drinkMos = new MoscowCoffeShop();
        LondonCoffeShop drinkLon = new LondonCoffeShop();
        if (n==1){
            //почему метод называется waitWait.. можно ведь просто wait
            //метод wait должен вызываться внутри методов makelatte, makeCapuccino и тд
            //это не повлияет на работоспособность, просто так мы избавимся от лишних строк в вызывающем коде
            drinkNY.waitWait();
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
            drinkMos.waitWait();
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
            drinkLon.waitWait();
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

// все классы-кофейни должны быть в отдельных файлах
class NewYorkCoffeShop {
    void waitWait(){
        System.out.println("Please,wait a minute");
    }
    void makelatte(){
        //вот здесь должен быть вызов метода wait. и в остальных тоже
        System.out.println("Thanks for order in New York, take your latte. Bye!");
    }
    void makeCapuccino() {
        System.out.println("Thanks for order in New York, take your capuccino. Bye!");
    }
    void makeEspresso() {
        System.out.println("Thanks for order in New York, take your espresso. Bye!");
    }
}
class MoscowCoffeShop {
    void waitWait(){
        System.out.println("Please,wait a minute");
    }
    void makelatte(){
        System.out.println("Thanks for order in Moscow, take your latte. Bye!");
    }
    void makeCapuccino() {
        System.out.println("Thanks for order in Moscow, take your capuccino. Bye!");
    }
    void makeEspresso() {
        System.out.println("Thanks for order in Moscow, take your espresso. Bye!");
    }
}
class LondonCoffeShop {
    void waitWait(){
        System.out.println("Please,wait a minute");
    }
    void makelatte(){
        System.out.println("Thanks for order in London, take your latte. Bye!");
    }
    void makeCapuccino() {
        System.out.println("Thanks for order in London, take your capuccino. Bye!");
    }
    void makeEspresso() {
        System.out.println("Thanks for order in London, take your espresso. Bye!");
    }

}
