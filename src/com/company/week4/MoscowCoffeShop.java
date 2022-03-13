package com.company.week4;
import java.util.Scanner;
public class MoscowCoffeShop extends MakeCoffeeShop implements Biscuits {
    public MoscowCoffeShop(String name){
        super(name);
    }
    @Override
    public void sellBiscuits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want buy some biscuits?");
        String answerBiscuits = sc.nextLine();
        if (answerBiscuits.equals("Yes")){
        System.out.println("Take your biscuits");
    } sc.close();
    }

}

