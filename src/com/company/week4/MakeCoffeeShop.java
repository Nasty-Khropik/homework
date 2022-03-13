package com.company.week4;

public abstract class MakeCoffeeShop {
    public String name;
    public MakeCoffeeShop(String name){
        this.name = name;
    }
    int latteCount;
    int capuccinoCount;
    int espressoCount;

    double lattePrice = 3.20;
    double capuccinoPrice = 2.60;
    double espressoPrice = 1.80;
    double proceed;

    public static void waiting(){
        System.out.println("Please,wait a minute");
    }
    public void makeLatte(){
        MakeCoffeeShop.waiting();
        System.out.printf("Thanks for order in %s, take your latte. Bye!", name);
    }
    public void makeCapuccino() {
        MakeCoffeeShop.waiting();
        System.out.printf("Thanks for order in %s, take your capuccino. Bye!", name);
    }
    public void makeEspresso() {
        MakeCoffeeShop.waiting();
        System.out.printf("Thanks for order in %s, take your espresso. Bye!", name);
    }
    public void dontMake() {
        System.out.println("Put 1,2 or 3");
    }
    public void getStatistics(){
        System.out.printf("Latte sold - %d, capuccino sold - %d, espresso sold - %d,. Proceed: %f", latteCount, capuccinoCount, espressoCount, proceed);
    }


}
