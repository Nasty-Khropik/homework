package com.company.week2;

public class Task2 {
    public static void main(String[] args){
        String [] names = {"John", "Bob", "Mary", "Peter", "Sarah"};
        int count = names.length;
        for (int i=0; i< count; i++){
            int len = names[i].length();
            if (len<2)
                continue;
            if (len<4){
                System.out.println("Ваше имя короче 4 букв");
            }
            else if (len>4){
                System.out.println("Ваше имя длиннее 4 букв");
            }
            else{
                System.out.println("Ваше имя состоит из 4 букв");
            }
            if (len>10)
            break;
        }
        int i = 0;
        while ( i< count) {
            int len = names[i].length();
            if (len<2)
                continue;
            if (len<4){
                System.out.println("Ваше имя короче 4 букв");
            }
            else if (len>4){
                System.out.println("Ваше имя длиннее 4 букв");
            }
            else{
                System.out.println("Ваше имя состоит из 4 букв");
            }
            if (len>10)
                break;
            i++;
            }
        int u=0;
        do{
            int len = names[u].length();
            if (len<2)
                continue;
            if (len<4){
                System.out.println("Ваше имя короче 4 букв");
            }
            else if (len>4){
                System.out.println("Ваше имя длиннее 4 букв");
            }
            else{
                System.out.println("Ваше имя состоит из 4 букв");
            }
            if (len>10)
                break;
            u++;

        } while (u < count);

        }
    }

