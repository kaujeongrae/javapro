package koreaaerospace.javapro;

/**
 * Created by jojeongrae on 2017-06-10.
 */

public class Bank {
    private double interest;
    private int month;
    private double money;

    public Bank(double interest, int month, double money){
        this.interest=interest;
        this.month=month;
        this.money=money;
    }

    public void setinterest(double interest){
        this.interest=interest;
    }

    public void setmonth(int month){
        this.month=month;
    }

    public void setmoney(double money){
        this.money=money;
    }

    public void getinterest(){
        System.out.println("현재의 이자율은 "+interest+"입니다");
    }

    public void getmonth(){
        System.out.println("현재의 경과 기간은 "+month+"입니다");
    }

    public void getmoney(){
        System.out.println("현재의 잔고는 "+money+"입니다");
    }
}
