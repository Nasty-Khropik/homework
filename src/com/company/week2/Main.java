package com.company.week2;

public class Main {
    public static void main(String[] args){
        int a = 91;
        if ((a>=1)&(a<=25)){
            System.out.println("Плохо");
        }
        else if ((a>=26)&(a<=50)){
            System.out.println("Ниже среднего");
        }
        else if ((a>=51)&(a<=75)){
            System.out.println("Выше среднего");
        }
        else if ((a>=76)&(a<=100)){
            System.out.println("Отлично");
        }
        else {
            System.out.println("Ошибка");
        }
    }
}
