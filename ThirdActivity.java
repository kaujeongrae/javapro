package koreaaerospace.javapro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by jojeongrae on 2017-06-12.
 */

public class ThirdActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent=getIntent();
        String data=intent.getStringExtra("value");
    }

    public void onClick(View view){
        finish();
    }

    private double balance;

    public void Bank(double money){
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

