package com.company.week7;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

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

    public void serializeUsers(List<User> users) {
        User user = new User();
        try {
            FileOutputStream fos = new FileOutputStream("Users.data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(user);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
