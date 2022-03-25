package com.company.week7;
import java.util.Scanner;
public class BankMenu {
    Bank bank = new Bank();
    private Bank newBank = bank;

    private void showLogin() {

    }
    private void showRegister() {

    }

    public void showStartMenu() {
        System.out.println("Select one:" + "\n1. Login" + "\n2. Register" + "\n0. Exit");
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
}
