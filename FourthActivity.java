package koreaaerospace.javapro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by jojeongrae on 2017-06-12.
 */

public class FourthActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Intent intent=getIntent();
        String data1=intent.getStringExtra("value");
        String data2=intent.getStringExtra("value");
    }

    public void onClick(View view){
        finish();
    }

    private double price=0;

    public void addcost(double money){
        price=price+money;
    }

    public double getcost(){
        return price;
    }
}

/**
 * Created by jojeongrae on 2017-06-10.
 */


