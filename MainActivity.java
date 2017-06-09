package koreaaerospace.javapro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //은행 초기 설정
        Bank a=new Bank(10000000);
        System.out.println("은행에 입금할 금액은?");
        double b=sc.nextDouble();
        a.summoney(b);
        a.showmoney();

        //가계부 초기 설정
        String gh=sc.nextLine();
        double p=sc.nextDouble();
        Diary k=new Diary(gh,p);




    }
}