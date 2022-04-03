package com.company.week7;
import java.io.*;
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

    public void deserializeUsers() throws ClassNotFoundException {
        try {
            FileInputStream fis = new FileInputStream("Users.data");
            ObjectInputStream ois = new ObjectInputStream(fis);

            User user = (User) ois.readObject();

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

}
