package com.engeto;

public class Account
{
    private double balance;
    private String name;
    public Account(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }
    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }
    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }
    public String toString() {
        return this.name;
    }
    public double balance() {
        return balance;
    }
}