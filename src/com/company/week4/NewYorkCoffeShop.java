package com.company.week4;

public class NewYorkCoffeShop extends MakeCoffeeShop {
    public void waiting(){
        System.out.println("Please,wait a minute");
    }
    public void makelatte(){
        this.waiting();
        System.out.println("Thanks for order in New York, take your latte. Bye!");
    }
    public void makeCapuccino() {
        this.waiting();
        System.out.println("Thanks for order in New York, take your capuccino. Bye!");
    }
    public void makeEspresso() {
        this.waiting();
        System.out.println("Thanks for order in New York, take your espresso. Bye!");
    }
}
