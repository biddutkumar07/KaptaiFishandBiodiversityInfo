package com.example.biddutkarmakar.kaptainewcorrection;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Splashscreen extends Activity {
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        window.setFormat(PixelFormat.RGBA_8888);
    }
    /** Called when the activity is first created. */
    Thread splashTread;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        StartAnimations();
        MediaPlayer music= MediaPlayer.create(Splashscreen.this,R.raw.forest);
        music.start();
    }
    private void StartAnimations() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();
        LinearLayout l=(LinearLayout) findViewById(R.id.lin_lay);
        l.clearAnimation();
        l.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        //ImageView iv = (ImageView) findViewById(R.id.splash);
        //iv.clearAnimation();
        //iv.startAnimation(anim);

      /*  String fontPath1 = "fonts/AdorshoLipi_20-07-2007.ttf";
        TextView txtGhost1 = (TextView) findViewById(R.id.title1);
        Typeface tf1 = Typeface.createFromAsset(getAssets(), fontPath1);
        txtGhost1.setTypeface(tf1);

        //TextView tv = (TextView) findViewById(R.id.title1);
        txtGhost1.clearAnimation();
        txtGhost1.startAnimation(anim);

        */

        splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(5000);

                    Intent intent = new Intent(Splashscreen.this,
                            MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    Splashscreen.this.finish();
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    Splashscreen.this.finish();
                }

            }
        };
        splashTread.start();

    }

}
