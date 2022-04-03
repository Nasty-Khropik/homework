package com.company.week7;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private boolean gender;
    private String email;
    private String password;
    private ArrayList<String> loan;
    private ArrayList<String> debitCard;

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public Date getBirthDate(){
        return birthDate;
    }
    public void setBirthDate(Date birthDate){
        this.birthDate = birthDate;
    }

    public boolean getGender(){
        return gender;
    }
    public void setGender(boolean gender){
        this.gender = gender;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public ArrayList<String> getLoan() {
        return loan;
    }
    public void setLoan(ArrayList<String> loan) {
        this.loan = loan;
    }

    public ArrayList<String> getDebitCard() {
        return debitCard;
    }
    public void setDebitCard(ArrayList<String> debitCard) {
        this.debitCard = debitCard;
    }

    @Override
    public String toString() {
        return ("First name: " + firstName + "\nLast name: " + lastName + "\nBirth date: " + birthDate + "\nGender: " + gender + "\nE-mail: " + email + "\nPassword: " + password + "\nLoan: " + loan + "\nDebit card: " + debitCard);
    }
}
