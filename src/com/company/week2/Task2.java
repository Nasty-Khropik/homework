package com.company.week2;

//все отлично сделано!
//пару советов: строка 10 здесь необязательна, мы могли бы вместо нее, сразу в строке 11
//исользовать длину массива без доп.переменной: for (int i=0; i < names.length; i++)
//и второй совет: все операторы (> < = !=, и тд) лучше окружать пробелами для лучшей читаемости (len<4) -> (len < 4)
public class Task2 {
    public static void main(String[] args){
        String [] names = {"John", "Bob", "Mary", "Peter", "Sarah"};
        int count = names.length;
        for (int i=0; i< count; i++){
            int len = names[i].length();
            if (len<2)
                continue;
            if (len>10)
                break;
            if (len<4){
                System.out.println("Ваше имя короче 4 букв");
            }
            else if (len>4){
                System.out.println("Ваше имя длиннее 4 букв");
            }
            else{
                System.out.println("Ваше имя состоит из 4 букв");
            }

        }
        int i = 0;
        while ( i< count) {
            int len = names[i].length();
            if (len<2)
                continue;
            if (len>10)
                break;
            if (len<4){
                System.out.println("Ваше имя короче 4 букв");
            }
            else if (len>4){
                System.out.println("Ваше имя длиннее 4 букв");
            }
            else{
                System.out.println("Ваше имя состоит из 4 букв");
            }
            i++;
            }
        int u=0;
        do{
            int len = names[u].length();
            if (len<2)
                continue;
            if (len>10)
                break;
            if (len<4){
                System.out.println("Ваше имя короче 4 букв");
            }
            else if (len>4){
                System.out.println("Ваше имя длиннее 4 букв");
            }
            else{
                System.out.println("Ваше имя состоит из 4 букв");
            }
            u++;

        } while (u < count);

        }
    }

