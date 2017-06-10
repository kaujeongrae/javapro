package koreaaerospace.javapro;

/**
 * Created by jojeongrae on 2017-06-10.
 */

public class Bank {

    private double balance;

    public Bank(double money){
        balance=money;
    }

    public double getbalance(){
        return balance;
    }

    public void plus(double money){
        balance=balance+money;
    }

    public void debit(double money){
        balance=balance-money;
    }


}
