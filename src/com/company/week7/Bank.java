package com.company.week7;

public class Bank {
    public void start(){
        BankMenu menu = new BankMenu(this);
        menu.showStartMenu();

    }

    public boolean doLogin(String email, String password){
        return true;
    }
    public void doRegister(User user){

    }
}
