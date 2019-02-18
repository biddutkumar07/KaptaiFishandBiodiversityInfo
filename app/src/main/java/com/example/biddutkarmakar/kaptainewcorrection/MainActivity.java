package com.example.biddutkarmakar.kaptainewcorrection;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends Activity implements View.OnClickListener{

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    Animation fade_in, fade_out;
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);  */

      /*  view.getLayoutParams().width = getScreenWidth();
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics).widthPixels;  */

        viewFlipper = (ViewFlipper) this.findViewById(R.id.bckgrndViewFlipper1);
        fade_in = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_out);
        viewFlipper.setInAnimation(fade_in);
        viewFlipper.setOutAnimation(fade_out);
//sets auto flipping
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.startFlipping();


        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);
        btn7=(Button)findViewById(R.id.button7);
        btn8=(Button)findViewById(R.id.button8);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);

    }

    public void onClick(View v)
    {
        int id;
        id=v.getId();
        switch (id)
        {
            case R.id.button1:
                Intent intent1=new Intent(this,FishBioversity.class);
                startActivity(intent1);
                break;

            case R.id.button2:
                Intent intent2=new Intent(this,FishProduction.class);
                startActivity(intent2);
                break;

            case R.id.button3:
                Intent intent3=new Intent(this,SustainableMangement.class);
                startActivity(intent3);
                break;

            case R.id.button4:
                Intent intent4=new Intent(this,FishResource.class);
                startActivity(intent4);
                break;

            case R.id.button5:
                Intent intent5=new Intent(this,FishDisese.class);
                startActivity(intent5);
                break;

            case R.id.button6:
                Intent intent6=new Intent(this,FishCultureCalander.class);
                startActivity(intent6);
                break;

            case R.id.button7:
                Intent intent7=new Intent(this,Inventor.class);
                startActivity(intent7);
                break;

            case R.id.button8:
                Intent intent8=new Intent(this,EmergencyContact.class);
                startActivity(intent8);
                break;


        }
    }

}
