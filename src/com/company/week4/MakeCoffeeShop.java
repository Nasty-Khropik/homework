package com.company.week4;

public abstract class MakeCoffeeShop {
    public String name;
    public MakeCoffeeShop(String name){
        this.name = name;
    }

    public static void waiting(){
        System.out.println("Please,wait a minute");
    }
    
    //названия методов должны быть в camelCase, как методы которые после latte у тебя
    public void makelatte(){
        MakeCoffeeShop.waiting();
        System.out.println("Thanks for order in " + name +", take your latte. Bye!");
    }
    public void makeCapuccino() {
        MakeCoffeeShop.waiting();
        System.out.println("Thanks for order in " + name +", take your capuccino. Bye!");
    }
    public void makeEspresso() {
        MakeCoffeeShop.waiting();
        System.out.println("Thanks for order in " + name +", take your espresso. Bye!");
    }
    public void dontMake() {
        System.out.println("Put 1,2 or 3");
    }

}
