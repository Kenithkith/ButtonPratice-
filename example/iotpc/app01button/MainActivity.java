package com.example.iotpc.app01button;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button button1; //네이버
    Button button4; //서울툰
    Button button5; //밥매뉴
    Button button6; //일배야
    Button button3; //우리넷
    Button button10; //대학교사이트
    Button button8; //유튜브
    Button button11; //페이스북



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button3 = (Button) findViewById(R.id.button3);
        button10 = (Button) findViewById(R.id.button10);
        button8 = (Button) findViewById(R.id.button8);
        button11 = (Button) findViewById(R.id.button11);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "버튼이 눌렸어요",
                        Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));

                startActivity(intent);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "버튼이 눌렸어요",
                        Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.seoultoon.com"));

                startActivity(intent);
            }
        });


        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "버튼이 눌렸어요",
                        Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.korchamhrd.net/bbs/bbsDetail.do?bbs_id=216&rootMenuId=64&menuId=67&currentPage=1&customer_page_list=&list_type=1&bbs_sno=199893&passwd="));

                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "버튼이 눌렸어요",
                        Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ilbeya.net"));

                startActivity(intent);
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "버튼이 눌렸어요",
                        Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nobra2.net/bbs/board.php?bo_table=kr_woori3"));

                startActivity(intent);
            }
        });



        button10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "버튼이 눌렸어요",
                        Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://knou.ac.kr"));

                startActivity(intent);
            }
        });



        button8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "버튼이 눌렸어요",
                        Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com"));

                startActivity(intent);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "버튼이 눌렸어요",
                        Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com"));

                startActivity(intent);
            }
        });




    }

}

