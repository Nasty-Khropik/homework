package com.company.week7;
import java.util.Scanner;

//здесь совсем запуталась
public class BankMenu {
    //зачем тут 2 переменные которые ссылаются на один и тот же объект
    //достаточно одной, но без иницилизации. Инициализация должна быть в конструкторе. Что-то вроде:
    // private final Bank bank;
    // public BankMenu(Bank bank) { this.bank = bank }
    Bank bank = new Bank();
    private Bank newBank = bank;

    // Олег, привет! что- то я перестала понимать и так мыслить, скорее всего пробелы в теории из-за нехватки времени в последнее время
    // я перестала понимать когда что надо применять

    private void showLogin() {

    }
    private void showRegister() {

    }

    public void showStartMenu() {
        System.out.println("Select one: \n1. Login \n2. Register \n0. Exit");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        if (choose == 1) {
            //тут ты пытаешься вызвать метод showLogin() у переменной choose типа int. У нее нет таких методов
            //нам нужно вызвать метод который находится в этом же классе. Мы можем его вызвать просто написав showLogin()
            choose.showLogin();
        }
        else if (choose == 2) {
            //здесь то же самое что и выше
            choose.showRegister();
        }
        else (System.exit(0));
    }

    public void showBankMenu(){
        System.out.println("1.Show my info \n2.Add loan \n3.Add debit card \n0.Exit");
    }
}
