package com.example.biddutkarmakar.kaptainewcorrection;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class EmergencyContact extends AppCompatActivity {

    TextView tx1, tx2, tx3, tx4, tx5, tx6, tx7, tx8, tx9, tx10, tx11, tx12, tx13, tx14, tx15, tx16, tx17, tx18, tx19, tx20, tx21, tx22, tx23, tx24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contact);

        String fontPath1 = "fonts/AdorshoLipi_20-07-2007.ttf";
        Typeface tf1 = Typeface.createFromAsset(getAssets(), fontPath1);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<b>  জরুরী যোগাযোগ   </b>"));

        TextView msg = (TextView) findViewById(R.id.text7);
        TextView msg2 = (TextView) findViewById(R.id.text15);
        TextView msg3 = (TextView) findViewById(R.id.text23);
        assert msg != null;
        assert msg2 != null;
        assert msg3 != null;
        msg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                // String phoneNumber = "০১৫১৭-২৬৭৫৭১";
                String message = " write something...!!";
                //sendSMS(phoneNumber);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "01517-267571"));
                intent.putExtra("sms_body", message);
                startActivity(intent);


            }
        });


        msg2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                // String phoneNumber = "০১৫১৭-২৬৭৫৭১";
                String message = " write something...!!";
                //sendSMS(phoneNumber);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "01720-322046"));
                intent.putExtra("sms_body", message);
                startActivity(intent);


            }
        });


        msg3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                // String phoneNumber = "০১৫১৭-২৬৭৫৭১";
                String message = " write something...!!";
                //sendSMS(phoneNumber);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "01711-045889"));
                intent.putExtra("sms_body", message);
                startActivity(intent);


            }
        });


        tx1 = (TextView) findViewById(R.id.text1);
        tx2 = (TextView) findViewById(R.id.text2);
        tx3 = (TextView) findViewById(R.id.text3);
        tx4 = (TextView) findViewById(R.id.text4);
        tx5 = (TextView) findViewById(R.id.text5);
        tx6 = (TextView) findViewById(R.id.text6);
        tx7 = (TextView) findViewById(R.id.text7);
        tx8 = (TextView) findViewById(R.id.text8);
        tx9 = (TextView) findViewById(R.id.text9);
        tx10 = (TextView) findViewById(R.id.text10);
        tx11 = (TextView) findViewById(R.id.text11);
        tx12 = (TextView) findViewById(R.id.text12);
        tx13 = (TextView) findViewById(R.id.text13);
        tx14 = (TextView) findViewById(R.id.text14);
        tx15 = (TextView) findViewById(R.id.text15);
        tx16 = (TextView) findViewById(R.id.text16);
        tx17 = (TextView) findViewById(R.id.text17);
        tx18 = (TextView) findViewById(R.id.text18);
        tx19 = (TextView) findViewById(R.id.text19);
        tx20 = (TextView) findViewById(R.id.text20);
        tx21 = (TextView) findViewById(R.id.text21);
        tx22 = (TextView) findViewById(R.id.text22);
        tx23 = (TextView) findViewById(R.id.text23);
        tx24 = (TextView) findViewById(R.id.text24);

        tx1.setTypeface(tf1);
        tx2.setTypeface(tf1);
        tx3.setTypeface(tf1);
        tx4.setTypeface(tf1);
        tx5.setTypeface(tf1);
        tx6.setTypeface(tf1);
        tx7.setTypeface(tf1);
        tx8.setTypeface(tf1);
        tx9.setTypeface(tf1);
        tx10.setTypeface(tf1);
        tx11.setTypeface(tf1);
        tx12.setTypeface(tf1);
        tx13.setTypeface(tf1);
        tx14.setTypeface(tf1);
        tx15.setTypeface(tf1);
        tx16.setTypeface(tf1);
        tx17.setTypeface(tf1);
        tx18.setTypeface(tf1);
        tx19.setTypeface(tf1);
        tx20.setTypeface(tf1);
        tx21.setTypeface(tf1);
        tx22.setTypeface(tf1);
        tx23.setTypeface(tf1);
        tx24.setTypeface(tf1);


    }
}
