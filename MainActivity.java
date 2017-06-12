package koreaaerospace.javapro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import java.util.*;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view) {
        // 버튼의 id를 가져온다.
        switch (view.getId()){
            case R.id.btn1://정기예금
                Intent intent1=new Intent(this,SubActivity.class);
                //intent1.putExtra("value",10000);//두번째 인자를 숫자로. 그리고 입력방법은?
                startActivity(intent1);
                break;

            case R.id.btn2://입출금예금
                //btn2을 눌렀을 때 처리
                Intent intent2=new Intent(this,ThirdActivity.class);
                intent2.putExtra("value",10000);//두번째 인자를 숫자로. 그리고 입력방법은?
                startActivity(intent2);
                break;

            case R.id.btn3://가계부
                //btn3을 눌렀을 때의 처리
                Intent intent3=new Intent(this,FourthActivity.class);
                intent3.putExtra("value","name");//두번째 인자를 품목으로. 그리고 입력방법은?
                intent3.putExtra("value",10000);//두번째 인자를 숫자로. 그리고 입력방법은?
                startActivity(intent3);
                break;
        }
    }







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //입출금예금
        Bank account = new Bank(100000);
        System.out.println("은행에 입금할 금액은?");
        double money1 = sc.nextDouble();
        account.plus(money1);
        System.out.println("현재 잔고: " + account.getbalance());

        System.out.println("은행에서 출금할 금액은?");
        double money2 = sc.nextDouble();
        account.debit(money2);
        System.out.println("현재 잔고: " + account.getbalance());

        //정기예금
        System.out.println("은행에 예금할 개월 수는?");
        int month = sc.nextInt();
        SavingBank account2 = new SavingBank(100000, 0.03, month);
        System.out.println(month + "개월 후 잔고: " + account2.getbalance());

        //가계부 반복입력+물품별 사용금액 출력
        System.out.println("숫자를 입력하세요. 1.식사 2.교통 3.학업 4.취미 5.기타 6.종료");
        int num = sc.nextInt();

        Diary food = new Diary();
        Diary transport = new Diary();
        Diary study = new Diary();
        Diary hobby = new Diary();
        Diary remainder = new Diary();
        while(num!=6) {
            if (num == 1) {
                System.out.println("쓴 비용은?");
                food.addcost(sc.nextDouble());
            } else if (num == 2) {
                System.out.println("쓴 비용은?");
                transport.addcost(sc.nextDouble());
            } else if (num == 3) {
                System.out.println("쓴 비용은?");
                study.addcost(sc.nextDouble());
            } else if (num == 4) {
                System.out.println("쓴 비용은?");
                hobby.addcost(sc.nextDouble());
            } else if (num == 5) {
                System.out.println("쓴 비용은?");
                remainder.addcost(sc.nextDouble());
            } else {
                System.out.println("수고하셨습니다.");
                break;
            }

            System.out.println("숫자를 입력하세요. 1.식사 2.교통 3.학업 4.취미 5.기타 6.종료");
            num = sc.nextInt();
        }

        System.out.println("품목별 지출내역입니다.");
        System.out.println("식사: "+food.getcost());
        System.out.println("교통: "+transport.getcost());
        System.out.println("학업: "+study.getcost());
        System.out.println("취미: "+hobby.getcost());
        System.out.println("기타: "+remainder.getcost());
    }


}