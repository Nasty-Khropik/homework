package com.company.week7;

import java.util.Date;

public class Loan {
    private Date dateOfRegistration;
    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }
    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    private double sum;
    public double getSum() {
        return sum;
    }
    public void setSum(double sum) {
        this.sum = sum;
    }

    private double interestRate;
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    private int loanTerm;
    public int getLoanTerm() {
        return loanTerm;
    }
    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    private double monthlyPayment;
    public double getMonthlyPayment() {
        return monthlyPayment;
    }
    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
}
