package koreaaerospace.javapro;

/**
 * Created by jojeongrae on 2017-06-10.
 */

public class SavingBank {
    private double interest;
    private int month;
    private double money;

    public SavingBank(double money, double interest,int month){
        this.money=money;
        this.interest=interest;
        this.month=month;
    }


    public double getbalance(){
        if (month>12){
            return Math.pow(money,1+interest);
        } else {
            return getbalance();
        }
    }



}
