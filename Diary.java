package koreaaerospace.javapro;

/**
 * Created by jojeongrae on 2017-06-10.
 */

public class Diary {
    private double price;

    public Diary(){
        price=0;
    }

    public void addcost(double money){
        price=price+money;
    }

    public double getcost(){
        return price;
    }
}
