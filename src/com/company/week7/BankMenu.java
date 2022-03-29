package com.company.week7;

import java.util.Scanner;

public class BankMenu {
    Scanner sc = new Scanner(System.in);
    private final Bank bank;
    public BankMenu(Bank bank) {
        this.bank = bank;
    }

    private void showLogin() {
        System.out.println("Enter your login:");
        String email = sc.nextLine();
        System.out.println("Enter your password:");
        String password = sc.nextLine();
        bank.doLogin(email,password);
    }
    private void showRegister() {

    }

    public void showStartMenu() {
        System.out.println("Select one: \n1. Login \n2. Register \n0. Exit");
        int choose = sc.nextInt();
        if (choose == 0) {
            System.exit(0);
        }
        else if (choose == 1) {
            showLogin();
        }
        else if (choose == 2) {
            showRegister();
        }
        else {
            System.out.println("You have entered a non-existent command");
        }
    }

    public void showBankMenu(){
        System.out.println("1.Show my info \n2.Add loan \n3.Add debit card \n0.Exit");
    }
}
