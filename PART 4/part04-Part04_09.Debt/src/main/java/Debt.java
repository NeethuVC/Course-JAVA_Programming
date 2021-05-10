/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Debt {
    private double balance;
    private double interestRate;
    public Debt(double initialBalance, double initialInterestRate){
        balance=initialBalance;
        interestRate=initialInterestRate;
    }
    public void printBalance(){
        System.out.println(balance);
    }
    public void waitOneYear(){
        double val=this.balance;
        val=(this.balance*this.interestRate);
        this.balance=val;
       // System.out.println(balance*interestRate);
    }
}
