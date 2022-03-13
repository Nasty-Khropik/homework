package com.company.week4;

//ты здесь почти закончила статистику, комменты ниже
public abstract class MakeCoffeeShop {
    public String name;
    public MakeCoffeeShop(String name){
        this.name = name;
    }
    
    //хоть по умолчанию примитивный тип int имеет значение 0, но для ясности я бы этим переменным сразу бы присвоил 0
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
        // в каждом методе make... нужно увеличивать соответствующую переменную count
        // тут должно быть latteCount++;
        // таким образом в методе getStatistics у тебя все верно будет отображаться
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
        //здесь перед тем как печатать статистику нужно сначала высчиатать proceed на основании всех проданных напитков, иначе он всегда будет 0: 
        // proceed = latteCount * latte + capuccinoCount * capuccinoPrice + espressoCount * espressoPrice
        System.out.printf("Latte sold - %d, capuccino sold - %d, espresso sold - %d,. Proceed: %f", latteCount, capuccinoCount, espressoCount, proceed);
    }


}
