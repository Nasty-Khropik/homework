package com.company.week7;

//почему-то ты создала поле menu и методы doLogin/doRegister внутри метода start. Это все должно быть вне метода start, просто внутри класса Bank
public class Bank {
    public void start(){
        BankMenu menu = new BankMenu();
        menu.showStartMenu();

        User user = new User();
        public boolean doLogin(String email, String password){
            return true;
        }
        public void doRegister(User user){

        }
    }
}
