package com.example.biddutkarmakar.kaptainewcorrection;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.webkit.WebView;
import android.widget.TextView;

public class FishCultureCalanderList1 extends AppCompatActivity {

   // TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12,tx13,tx14,tx15,tx16,tx17,tx18,tx19,tx20,tx21,tx22,tx23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_culture_calander_list1);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<b>  বর্ষপঞ্জী </b>"));


     /*   String fontPath1 = "fonts/AdorshoLipi_20-07-2007.ttf";
        Typeface tf1 = Typeface.createFromAsset(getAssets(), fontPath1);

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
        tx16=(TextView)findViewById(R.id.text16);
        tx17=(TextView)findViewById(R.id.text17);
        tx18=(TextView)findViewById(R.id.text18);
        tx19=(TextView)findViewById(R.id.text19);
        tx20=(TextView)findViewById(R.id.text20);
        tx21=(TextView)findViewById(R.id.text21);
        tx22=(TextView)findViewById(R.id.text22);
        tx23=(TextView)findViewById(R.id.text23);

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

        */

        WebView wv = (WebView) findViewById(R.id.webView1);
        wv.loadUrl("file:///assets/demo/my_page.html");
        wv.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData = " বৈশাখ (এপ্রিল-মে) \n\n";
        String pish = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas = "</body></html>";
        String myHtmlString = pish + myData + pas;
        wv.loadDataWithBaseURL(null,myHtmlString, "text/html", "UTF-8", null);

        WebView wv2 = (WebView) findViewById(R.id.webView2);
        wv2.loadUrl("file:///assets/demo/my_page.html");
        //wv2.setBackgroundColor(Color.parseColor("#919191"));
        String myData2 = " যারা কার্প জাতীয় মাছের রেণু চাষ করবেন তাদের জন্য এ সময়টা খুব গুরুত্বপূর্ণ। নার্সারী পুকুর ভাল ভাবে তৈরী করেই কেবল রেণু ছাড়া উচিত। যারা তেলাপিয়া এবং থাই কৈ চাষ করবেন তারা এ মাসের প্রথমে পোনা পাবেন। নার্সারী পুকুরে এ মাসে পোনা পরিচর্যা করে পরবর্তী মাসে চাষ পুকুরে ন্থানান্তর করবেন, শিং মাগুরের রেণু বা পোনা এ মাসে পেতে পারেন। গত বছরের মজুদ মাছ এ মাসে বিক্রি করলে লাভবান হতে পারেন । \n\n\n";
        String pish2 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas2 = "</body></html>";
        String myHtmlString2 = pish2 + myData2 + pas2;
        wv2.loadDataWithBaseURL(null,myHtmlString2, "text/html", "UTF-8", null);

        WebView wv3 = (WebView) findViewById(R.id.webView3);
        wv3.loadUrl("file:///assets/demo/my_page.html");
        wv3.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData3 = " জৈষ্ঠ্য (মে-জুন) \n\n";
        String pish3 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas3 = "</body></html>";
        String myHtmlString3 = pish3 + myData3 + pas3;
        wv3.loadDataWithBaseURL(null,myHtmlString3, "text/html", "UTF-8", null);

        WebView wv4 = (WebView) findViewById(R.id.webView4);
        wv4.loadUrl("file:///assets/demo/my_page.html");
        String myData4 = " গত মাসে আতুর পুকুরে ছাড়া রেণু পোনা এ মাসে ধানী পোনায় রুপান্তরিত হয়েছে। তাছাড়া চারা পোনার জন্য গতমাসে তৈরী করে রাখা পুকুরে এ মাসে ধানী পোনা মজুদ করতে হবে। তবে তার আগে ঘন ফাঁসের জাল টেনে জলজ আগাছা ও কীট-পতঙ্গ তুলে ফেলতে হবে। এ মাসেও কৈ-শিং-মাগুরের পোনা নাসিং করা এবং নাসিং পোনা চাষে ফেলা যাবে। শীতের আগে মজুদ করা মাছ এ মাসে ভাল দাম পাবেন  । \n\n";
        String pish4 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas4 = "</body></html>";
        String myHtmlString4 = pish4 + myData4 + pas4;
        wv4.loadDataWithBaseURL(null,myHtmlString4, "text/html", "UTF-8", null);

        WebView wv5 = (WebView) findViewById(R.id.webView5);
        wv5.loadUrl("file:///assets/demo/my_page.html");
        wv5.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData5 = " আষাঢ় (জুন-জুলাই) \n\n";
        String pish5 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas5 = "</body></html>";
        String myHtmlString5 = pish5 + myData5 + pas5;
        wv5.loadDataWithBaseURL(null,myHtmlString5, "text/html", "UTF-8", null);

        WebView wv6 = (WebView) findViewById(R.id.webView6);
        wv6.loadUrl("file:///assets/demo/my_page.html");
        String myData6 = " এ মাসে প্রচুর বৃষ্টিপাত হয়। এতে আতুর পুকুর, চারা পুকুর এমন কি মজুদ পুকুরের পাড় ভেঙ্গে যেতে পারে। এ জন্য পাড় মেরামতের প্রয়োজন হতে পারে। সম্ভব হলে অতিরিক্ত পানি পাইপের মাধ্যমে বের করে দিতে হবে। এ মাসে কৈ, শিং-মাগুর এবং তেলাপিয়া মাছকে যথাযথ খাবার পরিবেশন করতে হবে। গত বছরের মজুদ মাছ এ মাসেও বিক্রি করতে পারেন।যারা এখনো কার্প জাতীয় মাছের পোনা মজুদ পুকুরে স্থানান্তর করেনি তারা এখন মজুদ করতে পারেন ।  \n\n";
        String pish6 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas6 = "</body></html>";
        String myHtmlString6 = pish6 + myData6 + pas6;
        wv6.loadDataWithBaseURL(null,myHtmlString6, "text/html", "UTF-8", null);

        WebView wv7 = (WebView) findViewById(R.id.webView7);
        wv7.loadUrl("file:///assets/demo/my_page.html");
        wv7.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData7 = " শ্রাবণ (জুলাই-আগষ্ট) \n\n";
        String pish7 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas7 = "</body></html>";
        String myHtmlString7 = pish7 + myData7 + pas7;
        wv7.loadDataWithBaseURL(null,myHtmlString7, "text/html", "UTF-8", null);

        WebView wv8 = (WebView) findViewById(R.id.webView8);
        wv8.loadUrl("file:///assets/demo/my_page.html");
        String myData8 = " প্রথমে যারা কৈ মাছের পোনা মজুদ করেছেন তারা এ সময় প্রথম আহরণ করতে পারেন। এ সময় মাছের দাম ভালো পাওয়া যাবে। তেলাপিয়া মাছের আংশিক আহরণ করলে বাকী মাছের বৃদ্ধি ভালো হবে। প্রচুর বৃষ্টিতে পুকুরের পার তলিয়ে যাবার সম্ভাবনা থাকলে, বাশেঁর বানা এবং নাইলনের জাল দিয়ে ঘিরে দিতে হবে। শিং মাগুরের পুকুরে ঠিক ভাবে খাবার দেয়া ছাড়াও পানি ও পুকুরের তল দেশের পরিবেশ উন্নয়নে মনোযোগী হতে হবে। পুকুরের পাড় ডুবে গিয়ে থাকলে এ মাসে জাল টেনে রাক্ষুসে বা অবঞ্চিত মাছ ধরে ফেলতে হবে । \n\n";
        String pish8 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas8 = "</body></html>";
        String myHtmlString8 = pish8 + myData8 + pas8;
        wv8.loadDataWithBaseURL(null,myHtmlString8, "text/html", "UTF-8", null);

        WebView wv9 = (WebView) findViewById(R.id.webView9);
        wv9.loadUrl("file:///assets/demo/my_page.html");
        wv9.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData9 = " ভাদ্র (আগষ্ট-সেপ্টেম্বর) \n\n";
        String pish9 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas9 = "</body></html>";
        String myHtmlString9 = pish9 + myData9 + pas9;
        wv9.loadDataWithBaseURL(null,myHtmlString9, "text/html", "UTF-8", null);

        WebView wv10 = (WebView) findViewById(R.id.webView10);
        wv10.loadUrl("file:///assets/demo/my_page.html");
        String myData10 = " দ্বিতীয় দফায় কৈ মাছের চাষ করতে হলে, এ সময় নার্সিং করা কৈ মাছের পোনা মজুদ করতে হবে। তা নাহলে উক্ত চাষে সমূহ সমস্যার মুখোমুখি হতে হবে। তেলাপিয়া মাছ এ মাসে বিক্রি করে ফেললে দ্বিতীয় দফায় নার্সিং করা পোনা মজুদ করা যাবে। কার্প জাতীয় মাছের চাষ পুকুরে যথার্থ যত্ন নিতে হবে। যদি গত মাসে জাল টানা সম্ভব না হয়ে থাকে অথচ পুকুরের পাড় ভেঙ্গে বা ডুবে এক পুকুরের মাছ অন্য পুকুরে গিয়ে থাকে তাহলে এ মাসে তা বাছাই করে বা ঘনত্ব কমিয়ে দিতে হবে । \n\n";
        String pish10 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas10 = "</body></html>";
        String myHtmlString10 = pish10 + myData10 + pas10;
        wv10.loadDataWithBaseURL(null,myHtmlString10, "text/html", "UTF-8", null);

        WebView wv11 = (WebView) findViewById(R.id.webView11);
        wv11.loadUrl("file:///assets/demo/my_page.html");
        wv11.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData11 = " আশ্বিন/ কার্তিক (সেপ্টেম্বর- নভেম্বর)  \n\n";
        String pish11 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas11 = "</body></html>";
        String myHtmlString11 = pish11 + myData11 + pas11;
        wv11.loadDataWithBaseURL(null,myHtmlString11, "text/html", "UTF-8", null);

        WebView wv12 = (WebView) findViewById(R.id.webView12);
        wv12.loadUrl("file:///assets/demo/my_page.html");
        String myData12 = " এ মাসে পূর্বের মজুদ করা কৈ, তেলাপিয় প্রভৃতি মাছ বিক্রয় উপযোগী হলে বিক্রয় করা যেতে পারে। পানিতে প্রকৃতিক খাবারের ঘাটতি থাকলে (কার্প জাতীয় মাছের ক্ষেত্রে) পুকুরে প্রকৃতিক খাবার বৃদ্ধির ব্যবস্থা করতে হবে। পুকুরের পরিবেশ উন্নয়নে এবং মাছের স্বাস্থ্য পর্যাবেক্ষণ করে প্রয়োজনীয় ব্যবস্থা নিতি হবে । \n\n";
        String pish12 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas12 = "</body></html>";
        String myHtmlString12 = pish12 + myData12 + pas12;
        wv12.loadDataWithBaseURL(null,myHtmlString12, "text/html", "UTF-8", null);

        WebView wv13 = (WebView) findViewById(R.id.webView13);
        wv13.loadUrl("file:///assets/demo/my_page.html");
        wv13.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData13 = " অগ্রহায়ণ (নবেম্বর- ডিসেম্বর) \n\n";
        String pish13 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas13 = "</body></html>";
        String myHtmlString13 = pish13 + myData13 + pas13;
        wv13.loadDataWithBaseURL(null,myHtmlString13, "text/html", "UTF-8", null);


        WebView wv14 = (WebView) findViewById(R.id.webView14);
        wv14.loadUrl("file:///assets/demo/my_page.html");
        String myData14 = " এ সময় হালকা শীত পরার ফলে মাছের খাদ্য গ্রহন কিছুটা কমে আসবে। পুকুরের পানির পরিবেষ ক্ষতিগ্রস্থ হতে পারে। বিশেষত পুকুরে অ্যামোনিয়ার উপস্থিতি পাওয়া যেতে পারে। এ সময় মৎস্য বিশেষজ্ঞদের পরামর্শ নিয়ে যথযথ ব্যবস্থা গ্রহন করতে হবে। যারা দাম কম বলে এ সময়ে মাছ বিক্রি করতে চাইবেন না তারা মাছের ঘনত্ব কমিয়ে দেবেন  । \n\n";
        String pish14 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas14 = "</body></html>";
        String myHtmlString14 = pish14 + myData14 + pas14;
        wv14.loadDataWithBaseURL(null,myHtmlString14, "text/html", "UTF-8", null);

        WebView wv15 = (WebView) findViewById(R.id.webView15);
        wv15.loadUrl("file:///assets/demo/my_page.html");
        wv15.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData15 = " পৌষ (ডিসেম্বর-জনুয়ারী) \n\n";
        String pish15 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas15 = "</body></html>";
        String myHtmlString15 = pish15 + myData15 + pas15;
        wv15.loadDataWithBaseURL(null,myHtmlString15, "text/html", "UTF-8", null);


        WebView wv16 = (WebView) findViewById(R.id.webView16);
        wv16.loadUrl("file:///assets/demo/my_page.html");
        String myData16 = " এ সময় শীতকাল। মাছ চাষে ক্রান্তিকাল। অধিকাংশ খামারী বড় মাছ এ সময়ের মধ্যে বিক্রি করে দেয়। তবে যারা পরবর্তী বছরে  বিক্রয়ের জন্য রেখে দেন বা তেলাপিয়া ২০/৩০ গ্রামর পোনা পরবর্তী বছরের জন্য রাখবেন তাদের যথাযথ সাবধানতা অবলবম্বন করতে হবে। পুকুরের পানি পবির্তনের প্রয়োজন হতে পারে। পুকুরের অ্যামোনিয়া গ্যাস এমনকি মাছে ক্ষতরোগ দেখা দিতে পারে। পানির পরিবেশ উন্নয়নের জন্য প্রয়োজনীয় উপকরণ ব্যবহার করা আবশ্যক। কৈ চাষীরা যদি এ সময় মাছ রাখতে চান তাহলে প্রতিশতকে ১০০ মাছের বেশী রাখা ঠিক হবে না। তাছাড়া পুকুরের পরিবেশ উন্নয়নে মনোযোগী হতেই হবে। এ সময় শেষ মৌসুমের তেলাপিয়ার পোনা পরবর্তী বছরের জন্য নার্সারীতে রাখা যেতে পারে । \n\n";
        String pish16 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas16 = "</body></html>";
        String myHtmlString16 = pish16 + myData16 + pas16;
        wv16.loadDataWithBaseURL(null,myHtmlString16, "text/html", "UTF-8", null);


        WebView wv19 = (WebView) findViewById(R.id.webView19);
        wv19.loadUrl("file:///assets/demo/my_page.html");
        wv19.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData19 = " মাঘ (জানুয়ারী-ফেব্রুয়ারী)  \n\n";
        String pish19 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas19 = "</body></html>";
        String myHtmlString19 = pish15 + myData19 + pas19;
        wv19.loadDataWithBaseURL(null,myHtmlString19, "text/html", "UTF-8", null);


        WebView wv20 = (WebView) findViewById(R.id.webView20);
        wv20.loadUrl("file:///assets/demo/my_page.html");
        String myData20 = " এ সময়ে মাছের খাবার মোটা মুটি বন্ধ থাকবে। তবে, এ মাসের শেষের দিকে সামান্য খাবার দিতে হবে। তেলাপিয়া মাছ সামান্য পরিমানে খাবে। তবে, তা দেহের ওজনের ১% এর বেশী নয়। মাছের রোগ ব্যাধি এ সময় টাতে বেশী হয়। মাছকে সুস্থ রাখতে হলে পুকুর গ্যাস মুক্ত রাখতে হবে । \n\n";
        String pish20 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas20 = "</body></html>";
        String myHtmlString20 = pish20 + myData20 + pas20;
        wv20.loadDataWithBaseURL(null,myHtmlString20, "text/html", "UTF-8", null);

        WebView wv21 = (WebView) findViewById(R.id.webView21);
        wv21.loadUrl("file:///assets/demo/my_page.html");
        wv21.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData21 = " ফাল্গুন (ফেব্রুয়ারী-মার্চ) \n\n";
        String pish21 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas21 = "</body></html>";
        String myHtmlString21 = pish15 + myData21 + pas21;
        wv21.loadDataWithBaseURL(null,myHtmlString21, "text/html", "UTF-8", null);


        WebView wv22 = (WebView) findViewById(R.id.webView22);
        wv22.loadUrl("file:///assets/demo/my_page.html");
        String myData22 = " পরিকল্পিত প্রকল্প শুরু করতে এ সময়ে পুকুর খনন করতে হবে। যাদের পুকুরে মাছ আছে সে গুলো আবার খাবার শুরু করবে এবং মাছের বৃদ্ধি শুরু হবে। হঠাৎ করে খাবার বেশী দিয়ে অনেক সময় পুকুরের পানি নষ্ট হতে পারে এ ব্যাপারে সাবধানতা অবলম্বন করা আবশ্যক। পানি দ্রুত কমে গেলে এ সময় পানি দেয়ার ব্যবস্থা করতে হবে । \n\n";
        String pish22 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas22 = "</body></html>";
        String myHtmlString22 = pish22 + myData22 + pas22;
        wv22.loadDataWithBaseURL(null,myHtmlString22, "text/html", "UTF-8", null);

        WebView wv23 = (WebView) findViewById(R.id.webView23);
        wv23.loadUrl("file:///assets/demo/my_page.html");
        wv23.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData23 = " চৈত্র (মার্চ- এপ্রিল) \n\n";
        String pish23 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas23 = "</body></html>";
        String myHtmlString23 = pish15 + myData23 + pas23;
        wv23.loadDataWithBaseURL(null,myHtmlString23, "text/html", "UTF-8", null);


        WebView wv24 = (WebView) findViewById(R.id.webView24);
        wv24.loadUrl("file:///assets/demo/my_page.html");
        String myData24 = " নতুন পুকুর কাটা হয়ে থাকলে এখন থেকে আদর্শ পুকুর প্রস্তুতি শুরু করতে হবে। পানি অস্বাভাবিক কমে গেলে কিছু মাছ এ সময় বিক্রি করে দেয়া সম্ভব। এ মাসের শেষের দিকে তেলপিয়া এবং কৈ মাছের পোনা পাওয়া গেলে তা নার্সরী পুকুরে দিতে হবে। গত শীতের আগে জামিয়ে রাখা চাষ যোগ্য পোনা এ সময় মজুদ পুকুরে দিতে হবে ।  \n\n";
        String pish24 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas24 = "</body></html>";
        String myHtmlString24 = pish24 + myData24 + pas24;
        wv24.loadDataWithBaseURL(null,myHtmlString24, "text/html", "UTF-8", null);


    }
}
