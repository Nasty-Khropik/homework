package com.company.week7;

import java.util.Date;
import java.util.ArrayList;


public class User {
    private String firstName;
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    private String lastName;
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    private Date birthDate;
    public Date getBirthDate(){
        return birthDate;
    }
    public void setBirthDate(Date birthDate){
        this.birthDate = birthDate;
    }

    private boolean gender;
    public boolean getGender(){
        return gender;
    }
    public void setGender(boolean gender){
        this.gender = gender;
    }

    private String email;
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    private String password;
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    private ArrayList<String> loan;
    public ArrayList<String> getLoan() {
        return loan;
    }
    public void setLoan(ArrayList<String> loan) {
        this.loan = loan;
    }

    private ArrayList<String> debitCard;

    public ArrayList<String> getDebitCard() {
        return debitCard;
    }

    public void setDebitCard(ArrayList<String> debitCard) {
        this.debitCard = debitCard;
    }
}
