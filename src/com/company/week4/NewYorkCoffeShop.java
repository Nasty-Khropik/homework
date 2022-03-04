package com.company.week4;

public class NewYorkCoffeShop extends MakeCoffeeShop {
    public NewYorkCoffeShop (String name){
        this.name = name;
    }
    public void waiting(){
        System.out.println("Please,wait a minute");
    }
    public void makelatte(){
        this.waiting();
        System.out.println("Thanks for order in " + name +", take your latte. Bye!");
    }
    public void makeCapuccino() {
        this.waiting();
        System.out.println("Thanks for order in " + name +", take your capuccino. Bye!");
    }
    public void makeEspresso() {
        this.waiting();
        System.out.println("Thanks for order in " + name +", take your espresso. Bye!");
    }
}
