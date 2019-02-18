package com.example.biddutkarmakar.kaptainewcorrection;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Inventor extends AppCompatActivity  {


   // private Button btnOffice,btnPhone,btnEmail;
    TextView tx1,tx2,tx3,tx4,tx5,tx6;
    //TextView tx4,tx5,tx6,tx7,tx8,tx9,tx10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventor);

        String fontPath1 = "fonts/AdorshoLipi_20-07-2007.ttf";
        Typeface tf1 = Typeface.createFromAsset(getAssets(), fontPath1);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<b> উদ্ভাবক পরিচিতি     </b>"));


        //start labeling
       /* String st;
        String lab=" উদ্ভাবক পরিচিতি ";
        SpannableString spanString = new SpannableString(lab);
        spanString.setSpan(new StyleSpan(Typeface.BOLD), 0, spanString.length(), 0);


        ActionBar actionBar = getSupportActionBar(); // or getActionBar();
        getSupportActionBar().setTitle(); // set the top title
        String title = actionBar.getTitle().toString(); // get the title */

        //end labeling

        tx1=(TextView)findViewById(R.id.text12n);
        tx2=(TextView)findViewById(R.id.text1n);
        tx3=(TextView)findViewById(R.id.text3);
        tx4=(TextView)findViewById(R.id.text2);
        tx5=(TextView)findViewById(R.id.text2n);
        tx6=(TextView)findViewById(R.id.text3n);
    /*    tx7=(TextView)findViewById(R.id.text7);
        tx8=(TextView)findViewById(R.id.text8);
        tx9=(TextView)findViewById(R.id.text9);
        tx10=(TextView)findViewById(R.id.text10); */

        tx1.setTypeface(tf1);
        tx2.setTypeface(tf1);
        tx3.setTypeface(tf1);
        tx4.setTypeface(tf1);
        tx5.setTypeface(tf1);
        tx6.setTypeface(tf1);
    /*    tx7.setTypeface(tf1);
        tx8.setTypeface(tf1);
        tx9.setTypeface(tf1);
        tx10.setTypeface(tf1); */

     /*   btnOffice=(Button)findViewById(R.id.buttonOffice);
        btnPhone=(Button)findViewById(R.id.buttonPhone);
        btnEmail=(Button)findViewById(R.id.sendEmail);

        btnOffice.setOnClickListener(this);
        btnPhone.setOnClickListener(this);
        btnEmail.setOnClickListener(this);  */


        WebView wv = (WebView) findViewById(R.id.webView1);
        wv.loadUrl("file:///assets/demo/my_page.html");
        String myData = "এম এ বাশার জন্ম গ্রহণ করেন ১৯৮৩ সালের ২৫ ফেব্রুয়ারী রাজশাহী বাগমারা উপজেলায়। জনাব বাশার রাজশাহী বিশ্ববিদ্যালয় থেকে ২০০৬ সালে মৎস্য বিজ্ঞানে স্নাতক এবং ২০০৯ সালে বাংলাদেশ কৃষি বিশ্ববিদ্যালয় থেকে মাৎস্য চাষ বিষয়ে স্নাতকোতর ডিগ্রি লাভ করেন। তিনি ২০১০ সালের ০২ মে বৈজ্ঞানিক কর্মকর্তা পদে বাংলাদেশ মৎস্য গবেষণা ইনস্টিটিউটের বাগেরহাটেস্থ চিংড়ি গবেষণা কেন্দ্রে যোগদান করেন। উল্লেখ্য,২০১৩ সালে ২৯ এপ্রিল ইনস্টিটিউটের রাঙ্গামাটিস্থ নদী উপকেন্দ্র থেকে পরিচালিত কাপ্তাই লেকে মৎস্য উৎপাদন বৃদ্ধি,সংরক্ষণ ও ব্যবস্থাপনা জোরদারকরণ প্রকল্পের উপ প্রকল্প পরিচালকের দায়িত্ব পালন শেষে ২০১৬ সালে ৪ ফেব্রুয়ারী উক্ত উপকেন্দ্রের উপকেন্দ্র প্রধান হিসেবে দায়িত্ব পালন করছেন ।\n\n\n ";
        String pish = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/fonts/AdorshoLipi_20-07-2007.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas = "</body></html>";
        String myHtmlString = pish + myData + pas;
        wv.loadDataWithBaseURL(null,myHtmlString, "text/html", "UTF-8", null);

    }

  /*  public void onClick(View v) {
        int id;
        id = v.getId();
        switch (id) {

            case R.id.buttonOffice:
                dialContactPhone("035162159");
                break;

            case R.id.buttonPhone:
                dialContactPhone("01717671819");
                break;

            case R.id.sendEmail:
                sendEmail();
                break;

        }
    }

    private void dialContactPhone(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }

    protected void sendEmail() {
        Log.i("Send email", "");
        String[] TO = {"mabashar.bfri@gmail.com"};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.i("Finished sending email...", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Inventor.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }
     */


       /* WebView wv2 = (WebView) findViewById(R.id.webView2);
        wv2.loadUrl("file:///assets/demo/my_page.html");
        //wv2.setBackgroundColor(Color.parseColor("#919191"));
        String myData2 ="সার্বিক সহযোগিতা:ড.ইয়াহিয়া মাদমুদ\nমহাপরিচালক,বাংলাদেশ মৎস্য গবেষণা ইনস্টিটিউট। \n\n\n";
        String pish2 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas2 = "</body></html>";
        String myHtmlString2 = pish2 + myData2 + pas2;
        wv2.loadDataWithBaseURL(null,myHtmlString2, "text/html", "UTF-8", null); */

}
