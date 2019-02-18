package com.example.biddutkarmakar.kaptainewcorrection;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FishCultureCalanderList5 extends AppCompatActivity implements View.OnClickListener {

    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12,tx13,tx14,tx15;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_culture_calander_list5);
        btn1=(Button)findViewById(R.id.button1);
        btn1.setOnClickListener(this);

        String fontPath1 = "fonts/AdorshoLipi_20-07-2007.ttf";
        Typeface tf1 = Typeface.createFromAsset(getAssets(), fontPath1);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<b> কার্পজাতীয় মাছের পোনা উৎপাদন </b>"));

        tx1=(TextView)findViewById(R.id.text1);
        tx2=(TextView)findViewById(R.id.text2);
        tx3=(TextView)findViewById(R.id.text3);
        tx4=(TextView)findViewById(R.id.text4);
        tx5=(TextView)findViewById(R.id.text5);
        tx6=(TextView)findViewById(R.id.text6);
        tx7=(TextView)findViewById(R.id.text7);
        tx8=(TextView)findViewById(R.id.text8);
        tx9=(TextView)findViewById(R.id.text9);
        tx10=(TextView)findViewById(R.id.text10);
        tx11=(TextView)findViewById(R.id.text11);
        tx12=(TextView)findViewById(R.id.text12);
        tx13=(TextView)findViewById(R.id.text13);
        tx14=(TextView)findViewById(R.id.text14);
        tx15=(TextView)findViewById(R.id.text15);

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

    }

    public void onClick(View v)
    {
        int id;
        id=v.getId();
        switch (id)
        {
            case R.id.button1:
                Intent intent1=new Intent(this,FishCultureCalanderList5food.class);
                startActivity(intent1);
                break;

        }
    }
}
