package com.company.week4;

public class MoscowCoffeShop extends MakeCoffeeShop {
    public MoscowCoffeShop (String name){
        this.name = name;
    }
    @Override
    public void waiting(){
        System.out.println("Please,wait a minute");
    }
    @Override
    public void makelatte(){
        this.waiting();
        System.out.println("Thanks for order in " + name +", take your latte. Bye!");
    }
    @Override
    public void makeCapuccino() {
        this.waiting();
        System.out.println("Thanks for order in " + name +", take your capuccino. Bye!");
    }
    @Override
    public void makeEspresso() {
        this.waiting();
        System.out.println("Thanks for order in " + name +", take your espresso. Bye!");
    }
}
