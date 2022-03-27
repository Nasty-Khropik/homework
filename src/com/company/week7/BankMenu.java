package com.company.week7;
import java.util.Scanner;

public class BankMenu {
    private final Bank bank;
    public BankMenu(Bank bank) {
        this.bank = bank;
    }

    private void showLogin() {

    }
    private void showRegister() {

    }

    public void showStartMenu() {
        System.out.println("Select one: \n1. Login \n2. Register \n0. Exit");
        Scanner sc = new Scanner(System.in);
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
