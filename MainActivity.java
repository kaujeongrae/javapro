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

        System.out.println("은행에 입금할 금액은?");
        double bankmoney=sc.nextDouble();
        System.out.println("month?");
        int month=sc.nextInt();
        System.out.println("물품의 종류는?");
        String name=sc.nextLine();
        System.out.println("물품의 가격은?");
        int price=sc.nextInt();






    }
}