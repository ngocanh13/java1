package Calculationinterest;

import java.util.Scanner;

public class Bank {
    private double balance;
    private double annuallnterestRate;

    public Bank(double balance, double annuallnterestRate) {
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    public void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount owed");
        balance = sc.nextDouble();
        System.out.println("Enter annuallnterest rate");
        annuallnterestRate = sc.nextDouble();
    }
    public double calculateInterest(){
        return balance * (annuallnterestRate / 1200);
    }
}
