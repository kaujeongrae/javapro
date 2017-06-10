package koreaaerospace.javapro;

/**
 * Created by jojeongrae on 2017-06-10.
 */

public class SavingBank extends Bank {
    private double interest;

    public SavingBank(double money, double interest){
        super(money);
        this.interest=interest;
    }

    @Override
    public void showmoney(){
        System.out.println("현재의 잔고는 "+Math.pow(money,1+interest)+"입니다");
    }

    @Override
    public void summoney(double add) throws Exception{
        money=Math.pow(money,1+interest)+add;
    }
}
