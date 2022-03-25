package com.company.week7;

import java.util.Date;

public class DebitCard {
    private double currentBalance;
    private String cardNumber;
    private Date expirationDate;
    private int cvv;

    public double getCurrentBalance() {
        return currentBalance;
    }
    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCvv() {
        return cvv;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return ("Current balance: " + currentBalance + "\nCard number: " + cardNumber + "\nExpiration date: " + expirationDate + "\nCVV: " + cvv);
    }
}


