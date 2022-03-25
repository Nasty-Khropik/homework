package com.company.week7;

import java.util.Date;

public class Loan {
    private Date dateOfRegistration;
    private double sum;
    private double interestRate;
    private int loanTerm;
    private double monthlyPayment;

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }
    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public double getSum() {
        return sum;
    }
    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }
    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }
    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
    @Override
    public String toString() {
        return ("Date of registration: " + dateOfRegistration + "\nSumma: " + sum + "\nInterest rate: " + interestRate + "\nLoan term: " + loanTerm + "\nMonthly payment: " + monthlyPayment);
    }
}
