package com.company.week7;
import java.util.Scanner;
public class BankMenu {
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
            choose.showLogin();
        }
        else if (choose == 2) {
            choose.showRegister();
        }
        else (System.exit(0));
    }

    public void showBankMenu(){
        System.out.println("1.Show my info \n2.Add loan \n3.Add debit card \n0.Exit");
    }
}
