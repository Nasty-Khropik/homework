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
        
        // для того чтобы это было возможным - все классы-кофейни должны наследоваться от абстрактного класса (для этого он и создавался)
        // при наследовании у всех наследников появляются все не приватные методы и поля родителя (абстрактного класса)
        // то что классы пустые не запрещает нам создавать объекты этих классов: MoscowCoffeeShop cs = new MoscowCoffeeShop();
        // но при наследовании от абстрактного класса появляется возможность делать такие вещи:
        // MakeCoffeeShop current;
        // if (n == 1) { current = new NewYorkCoffeeShop();  }
        // else if (n == 2) { current = new MoscowCoffeeShop();  }
        // =======
        // if (m == 1) {  current.makelatte();  }
        
        // то есть теперь мы можем в единственную переменнную записать объект любой кофейни (так как они все наследуются от общего родителя)
        
        // я так и не поняла как имея только два класса: один абстрактный, второй main
        // вызвать методы абстрактного класса и создать объеты кофеен (когда до конца они должны остаться пустыми)
        // при этом не отходя от тз
    }
}

