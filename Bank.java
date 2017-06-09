package koreaaerospace.javapro;

/**
 * Created by jojeongrae on 2017-06-10.
 */

public class Bank {


    private double money;

    public Bank(double money){

        this.money=money;
    }

    public void showmoney(){
        System.out.println("현재의 잔고는 "+money+"입니다");
    }

    public void summoney(double add){
        money=money+add;
    }

}
