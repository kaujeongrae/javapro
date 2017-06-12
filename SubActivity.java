package koreaaerospace.javapro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by jojeongrae on 2017-06-12.
 */

public class SubActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent=getIntent();
        String data=intent.getStringExtra("value");
    }

    public void onClick(View view){
        finish();
    }

    private double interest;
    private int month;
    private double money;

    public void SavingBank(double money, double interest,int month){
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


