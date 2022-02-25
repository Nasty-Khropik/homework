package com.company.week4;

import java.util.Scanner;

public class Task {
    public static void main(String [] args){
        System.out.println("Из какого Вы города?");
        System.out.println("1.New York");
        System.out.println("2.Moscow");
        System.out.println("3.London");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        NewYorkCoffeShop drink1 = new NewYorkCoffeShop();
        MoscowCoffeShop drink2 = new MoscowCoffeShop();
        LondonCoffeShop drink3 = new LondonCoffeShop();
            if (n == 1) {
                drink1.makeCoffe();
            }
            else if (n == 2) {
                drink2.makeCoffe();
            }
            else if (n == 3) {
                drink3.makeCoffe();
            }
            else {
                System.out.println("Вы ввели неверное число");
            }
    }
}
class NewYorkCoffeShop {
    void makeCoffe(){
        System.out.println("Thanks for order in New York, take your coffe. Bye!");
    }
}
class MoscowCoffeShop {
    void makeCoffe(){
        System.out.println("Thanks for order in Moscow, take your coffe. Bye!");
    }

}
class LondonCoffeShop {
    void makeCoffe(){
        System.out.println("Thanks for order in London, take your coffe. Bye!");
    }

}
