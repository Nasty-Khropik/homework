package com.company.week4;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String [] args){
// до конца задание не довела.. в цикл замкнула, предполагаю что надо исключение добавить, но не знаю где, т к не до конца
// понимаю как на практике это делается.
// по подсчету тоже что-то не хватило соображалки как это осуществить. Вобщем, нечем похвастаться
        do {
            System.out.println("Из какого Вы города?");
            System.out.println("1.New York");
            System.out.println("2.Moscow");
            System.out.println("3.London");
            System.out.println("Выберите цифру:");
            Scanner sc = new Scanner(System.in);
            int city = sc.nextInt();
            System.out.println("Какой кофе Вы хотите заказать?");
            System.out.println("1.Latte");
            System.out.println("2.Capuccino");
            System.out.println("3.Espresso");
            System.out.println("Введите цифру:");
            int coffe = sc.nextInt();
            System.out.println("Do want get statistics?");
            String answer = sc.nextLine();
            MakeCoffeeShop current = null;
            if (answer.equals("Yes")) {
                assert current != null;
                current.getStatistics();
            }

            if (city == 1) {
                current = new NewYorkCoffeShop("New York");
            } else if (city == 2) {
                current = new MoscowCoffeShop("Moscow");
            } else if (city == 3) {
                current = new LondonCoffeShop("London");
            } else {
                System.out.println("Вы ввели неверное число.");
            }
            if (current instanceof Biscuits) {
                ((Biscuits) current).sellBiscuits();
            }
            if (coffe == 1) {
                assert current != null;
                current.makeLatte();
            } else if (coffe == 2) {
                assert current != null;
                current.makeCapuccino();
            } else if (coffe == 3) {
                assert current != null;
                current.makeEspresso();
            } else {
                assert current != null;
                current.dontMake();
            }

        } while (true);
    }
}

