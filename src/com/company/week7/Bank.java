package com.company.week7;
import java.io.*;
import java.util.List;

public class Bank {
    private BankMenu menu = new BankMenu(this);
    private List<User> users;
    public void start() throws ClassNotFoundException {
        deserializeUsers();
        menu.showStartMenu();
    }

    public boolean doLogin(String email, String password){
        for (User user: users) {
            if (user.getEmail() == email && user.getPassword() == password) {
                return true;
            }
        }
        return true;
    }
    public void doRegister(User user){
        serializeUsers((List<User>) user);

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
