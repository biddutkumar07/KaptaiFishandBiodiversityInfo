package com.example.biddutkarmakar.kaptainewcorrection;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.webkit.WebView;
import android.widget.TextView;

public class SustainableMangement extends AppCompatActivity {

   // TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12,tx13,tx14,tx15,tx16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sustainable_mangement);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<b> সহনশীল ব্যবস্থাপনা কৌশল  </b>"));




        //String fontPath1 = "fonts/AdorshoLipi_20-07-2007.ttf";
        //Typeface tf1 = Typeface.createFromAsset(getAssets(), fontPath1);

      /*  tx1=(TextView)findViewById(R.id.text1);
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

        */

        WebView wv = (WebView) findViewById(R.id.webView1);
        wv.loadUrl("file:///assets/demo/my_page.html");
        wv.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData = " মৎস্য প্রজননক্ষেত্র সংরক্ষণ ও ব্যবস্থাপনা\n\n";
        String pish = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas = "</body></html>";
        String myHtmlString = pish + myData + pas;
        wv.loadDataWithBaseURL(null,myHtmlString, "text/html", "UTF-8", null);

        WebView wv2 = (WebView) findViewById(R.id.webView2);
        wv2.loadUrl("file:///assets/demo/my_page.html");
        //wv2.setBackgroundColor(Color.parseColor("#919191"));
        String myData2 = " প্রজনন ক্ষেত্র ও প্রজনন অভিপ্রয়ণ পথগুলোতে পলি ভরাট হয়েছে এবং কোথাও কোথাও প্রজনন ক্ষেত্র স্থানান্তরিত হয়েছে। লেকে রুই জাতীয়  মাছের মজুদ বৃদ্ধিও  সংরক্ষণ করার জন্য প্রাকৃতিক প্রজনন ক্ষেত্রগুলো যেমন-কাসালং চ্যানেলে মাইনিমুখ এবং তদুর্ধ্ব এলাকা;কর্ণফুলী চ্যানেলে জগন্নাথছড়ি এবং তদুর্ধ্ব এলাকা; চেংগী চ্যানেলে নানিয়ারচর এবং তদুর্ধ্ব এলাকা এবং রেইনক্ষ্যং চ্যানেলে বিলাইছড়ি এবং তদুর্ধ্ব এলাকা পুনঃখননের মাধ্যমে ও সংরক্ষণের পাশাপাশি প্রজনন এলাকাগুলো অভয়াশ্রম ঘোষণা করে যথাযথ ব্যবস্থাপনার আওতায় আনতে হবে । \n\n\n";
        String pish2 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas2 = "</body></html>";
        String myHtmlString2 = pish2 + myData2 + pas2;
        wv2.loadDataWithBaseURL(null,myHtmlString2, "text/html", "UTF-8", null);

        WebView wv3 = (WebView) findViewById(R.id.webView3);
        wv3.loadUrl("file:///assets/demo/my_page.html");
        wv3.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData3 = " অভয়াশ্রম ব্যবস্থাপনার কার্যকারিতা\n\n";
        String pish3 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas3 = "</body></html>";
        String myHtmlString3 = pish3 + myData3 + pas3;
        wv3.loadDataWithBaseURL(null,myHtmlString3, "text/html", "UTF-8", null);

        WebView wv4 = (WebView) findViewById(R.id.webView4);
        wv4.loadUrl("file:///assets/demo/my_page.html");
        String myData4 = " হ্রদের জীব-বৈচিত্র্য রক্ষার জন্য লেকে সাতটি গুরুত্বপূর্ণ অংশকে অভয়াশ্রম হিসেবে ঘোষণা করা হয়েছে। রাঙ্গামাটি ডিসি বাংলো সংলগ্ন লেক এলাকা, বিএফডিসি রাঙ্গামাটি সদর অফিস সংলগ্ন লেক এলাকা, লংগদু উপজেলা কমপ্লেক্স  লেক এলাকা, ছয়কুড়ি বিল, নানিয়ারচর  লেক এলাকা, রাঙ্গামাটি রাজবন বিহার লেকএলাকা, কাপ্তাই উপজেলার নৌবাহিনী ক্যাম্প সংলগ্ন লেক এলাকা এবং বিলাই ছড়ি রেইনক্ষ্যং চ্যানেল সংলগ্ন  লেক এলাকা। মৎস্য উন্নয়ন কর্পোরেশন বাংলদেশ মৎস্য গবেষণা ইনস্টিটিউটের পরামর্শ মোতাবেক উক্ত স্থান গুলোতে অভয়াশ্রম প্রতিষ্ঠা করে মৎস্য প্রজাতিরসমূহের নির্বিঘ্ন প্রাকৃতিক প্রজনন নিশ্চিত করার মাধ্যমে জীব-বৈচিত্র্য সংরক্ষণের প্রচেষ্টা অব্যহত রেখেছে। হ্রদের জলায়তন প্রায় ৭০০ বর্গ কিঃ মিঃ। এর বিপরীতে সংখ্যা ও আয়তন উভয় বিবেচনাই অভয়াশ্রম অপ্রতুল। অভয়াশ্রমের সংখ্যা ও আয়তন বৃদ্ধির পাশাপাশি সারাবছর পানি থাকে এমন স্থানে অভয়াশ্রম ঘোষণা ও যথাযথ ব্যবস্থাপনা প্রয়োজন।  \n\n";
        String pish4 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas4 = "</body></html>";
        String myHtmlString4 = pish4 + myData4 + pas4;
        wv4.loadDataWithBaseURL(null,myHtmlString4, "text/html", "UTF-8", null);

        WebView wv5 = (WebView) findViewById(R.id.webView5);
        wv5.loadUrl("file:///assets/demo/my_page.html");
        wv5.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData5 = " পাহাড়ী ঘোনায় নার্সারী স্থাপন ও ব্যবস্থাপনা \n\n";
        String pish5 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas5 = "</body></html>";
        String myHtmlString5 = pish5 + myData5 + pas5;
        wv5.loadDataWithBaseURL(null,myHtmlString5, "text/html", "UTF-8", null);

        WebView wv6 = (WebView) findViewById(R.id.webView6);
        wv6.loadUrl("file:///assets/demo/my_page.html");
        String myData6 = " পোনা অবমুক্তি চেয়ে লেকের বিভিন্ন ঘোনায়/ক্রীকে নার্সারী স্থাপন করে কম সময়ে কম খরচে বেশী পোনা উৎপাদন করা যায় এবং অবমুক্তিজনিত মৃত্যু হার অনেক কম হয়। উৎপন্ন পোনা বর্ষার পানিতে/পাহাড়ী ঢলে প্লাবিত হয়ে স্বাভাবিকভাবে লেকে ছড়িয়ে পড়বে। ইনস্টিটিউটের রাঙ্গামাটিস্থ নদী উপকেন্দ্র কাপ্তাই লেকের পাহাড়ী ঘোনায় নার্সারী স্থাপন ও ব্যবস্থাপনা কৌশল উদ্ভাবন করেছে। ফলে পাহাড়ী এলাকায় কার্পজাতীয় মাছের রেণু পোনা থেকে ৬০ দিনে গুণগত মানসম্পন্ন আঙ্গুলী পোনার প্রাপ্যতা নিশ্চিত হয়েছে। ইনস্টিটিউটের উদ্ভাবিত এই প্রযুক্তি মৎস্য অধিদপ্তর কর্তৃক ব্যাপক সম্প্রসারন কার্যক্রম পরিচালনার ফলে পাহাড়ী এলাকায় রুই জাতীয় মাছের নার্সারী ব্যবস্থাপনরা নতুন সম্ভবানার দ্বার উম্মোচন করেছে ।  \n\n";
        String pish6 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas6 = "</body></html>";
        String myHtmlString6 = pish6 + myData6 + pas6;
        wv6.loadDataWithBaseURL(null,myHtmlString6, "text/html", "UTF-8", null);

        WebView wv7 = (WebView) findViewById(R.id.webView7);
        wv7.loadUrl("file:///assets/demo/my_page.html");
        wv7.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData7 = " নির্ধারিত আকারের বড় পোনা মজুদ ও ব্যবস্থাপনা  \n\n";
        String pish7 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas7 = "</body></html>";
        String myHtmlString7 = pish7 + myData7 + pas7;
        wv7.loadDataWithBaseURL(null,myHtmlString7, "text/html", "UTF-8", null);

        WebView wv8 = (WebView) findViewById(R.id.webView8);
        wv8.loadUrl("file:///assets/demo/my_page.html");
        String myData8 = " সহনশীল মৎস্য আহরণ অব্যহত রাখার নিমিত্ত প্রতি বছর লেক থেকে যে পরিমাণ মাছ ধরা হয়ে থাকে তা পুরণের লক্ষ্যে প্রতি মৌসুমে বাণিজ্যিক গুরুত্ব সম্পন্ন প্রজাতি সমূহের বিশেষ করে রুই জাতীয় মাছের ছোট-বড় বিভিন্ন সাইজের পোনা মজুদ করা হয়। পোনা মজুদ কর্মসূচী কার্যকর করার লক্ষ্যে বাংলদেশ মৎস্য গবেষণা ইনস্টিটিউট এর সুপারিশ মোতাবেক কমপক্ষে ২৫% পোনা প্রাকৃতিক প্রজননের (হালদা বা যমুনা নদীর) পোনা হতে হবে,বিএফডিসির নিজস্ব পোনা উৎপাদন কার্যক্রম পুনরায় চালু করতে হবে এবং  লেকের পরিবেশের সাথে খাপ খাওয়াাতে পারে এমন  সুস্থ, সবল ও নির্ধারিত আকারে বড় পোনা (১০-১৮ সেমি.) মজুদ করতে হবে । \n\n";
        String pish8 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas8 = "</body></html>";
        String myHtmlString8 = pish8 + myData8 + pas8;
        wv8.loadDataWithBaseURL(null,myHtmlString8, "text/html", "UTF-8", null);

        WebView wv9 = (WebView) findViewById(R.id.webView9);
        wv9.loadUrl("file:///assets/demo/my_page.html");
        wv9.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData9 = " ক্ষতিকর মৎস্য  শিকার  পদ্ধতি প্রতিরোধ ব্যবস্থাপনা  \n\n";
        String pish9 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas9 = "</body></html>";
        String myHtmlString9 = pish9 + myData9 + pas9;
        wv9.loadDataWithBaseURL(null,myHtmlString9, "text/html", "UTF-8", null);

        WebView wv10 = (WebView) findViewById(R.id.webView10);
        wv10.loadUrl("file:///assets/demo/my_page.html");
        String myData10 = " সাম্প্রতিক তথ্য থেকে জানা যায় যে, লেকের মোট আহরিত মাছের প্রায় ২৬% আসে জাঁক থেকে। জাঁকে আকার ও প্রজাতি নির্বিশেষে প্রায় সব ধরণের মাছ ধরা পড়ে। ফলে পোনা মাছ বিশেষ করে রুই জাতীয় মাছের পোনা নিধন হয়ে থাকে। অন্যদিকে জাঁকের মাছ সাধারণতঃ শুষ্ক মৌসুমে আহরণ করা হয় বিধায় সর্বশেষ আশ্রয়স্থল মনে করে জাঁকের ভিতরে গিয়ে একত্রিত হয়ে থাকা ডিমওয়ালা মাছও ব্যাপক হারে নিধন হয়ে থাকে। গবেষণার এ সকল বিষয় উদঘাটিত হওয়ার পর প্রদত্ত সুপারিশ মোতাবেক লেকে জাঁক পদ্ধতিতে মৎস্য শিকার নিষিদ্ধ ঘোষণা হয়েছে। কিন্তু আইন বা বিধিনিষেধ বিবেচনা না করে সকল ধরণের ও সব সাইজের মাছ ধরার হচ্ছে। কাপ্তাই লেকে সহনশীল মৎস্য ব্যবস্থাপনা লক্ষ্যে বিএফডিসি, মৎস্য অধিদপ্তর, বিএফআরআই ও অন্যান্য সংস্থাসমূহের সম্পৃক্ততার মাধ্যমে জাঁক পদ্ধতিতে মৎস্য শিকার প্রতিরোধ এবং গণসচেতনতা বৃদ্ধি মূলক কর্মসূচী বাস্তবায়ন করতে হবে। আবার লেকে ব্যবহৃত বিভিন্ন ধরণের জালসমুহের মধ্যে প্রায় ৯০% হচ্ছে ছোট ফাঁস বিশিষ্ট নিষিদ্ধ কারেন্ট জাল, যার ব্যবহার নিষিদ্ধ করতে হবে। সাথে সাথে বিভিন্ন সময় বিশেষ করে প্রজনন মৌসুমে লেক বন্ধ থাকাকালীন টহল টীমের মাধ্যমে কারেন্ট জাল আটক ও পোড়ানোসহ এর প্রতিরোধ কার্যক্রম জোরদার করতে হবে । \n\n";
        String pish10 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas10 = "</body></html>";
        String myHtmlString10 = pish10 + myData10 + pas10;
        wv10.loadDataWithBaseURL(null,myHtmlString10, "text/html", "UTF-8", null);

        WebView wv11 = (WebView) findViewById(R.id.webView11);
        wv11.loadUrl("file:///assets/demo/my_page.html");
        wv11.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData11 = " বিকল্প মৎস্য চাষ প্রদ্ধতি উদ্ভাবন সর্ম্পকীয় গবেষণা ও এর ব্যবস্থাপনা   \n\n";
        String pish11 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas11 = "</body></html>";
        String myHtmlString11 = pish11 + myData11 + pas11;
        wv11.loadDataWithBaseURL(null,myHtmlString11, "text/html", "UTF-8", null);

        WebView wv12 = (WebView) findViewById(R.id.webView12);
        wv12.loadUrl("file:///assets/demo/my_page.html");
        String myData12 = " লেকের বর্তমান মৎস্য উৎপাদন মূলতঃ গতানুগতিক আহরণভিত্তিক ব্যবস্থাপনা নির্ভর, চাষ নয়। বর্তমান মৎস্য উৎপাদন আরো বৃদ্ধির নিমিত্ত  বাংলাদেশ মৎস্য গবেষণা  ইনস্টিটিউট বিকল্প মৎস্য চাষ পদ্ধতি উদ্ভাবন সম্পর্কীয় গবেষণা কার্যক্রম পরিচালনা করে আসছে। খাঁচায় মনোসেক্স তেলাপিয়াসহ উচ্চ মূল্যমান সম্পন্ন মাছ (পাবদা, গুলশা), পেন ও ক্রীকে কার্প জাতীয় মাছ চাষের এর মাধ্যমে লেক বন্ধকালীন সময়ে জেলেদের বিকল্প কর্মসংস্থানের সুযোগ সৃৃষ্টি করা ।  \n\n";
        String pish12 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas12 = "</body></html>";
        String myHtmlString12 = pish12 + myData12 + pas12;
        wv12.loadDataWithBaseURL(null,myHtmlString12, "text/html", "UTF-8", null);


        WebView wv13 = (WebView) findViewById(R.id.webView13);
        wv13.loadUrl("file:///assets/demo/my_page.html");
        wv13.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData13 = " গবেষণা কার্যক্রম জোরদারকরণ  \n\n";
        String pish13 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas13 = "</body></html>";
        String myHtmlString13 = pish13 + myData13 + pas13;
        wv13.loadDataWithBaseURL(null,myHtmlString13, "text/html", "UTF-8", null);


        WebView wv14 = (WebView) findViewById(R.id.webView14);
        wv14.loadUrl("file:///assets/demo/my_page.html");
        String myData14 = " বাংলাদেশ মৎস্য গবেষণা ইনস্টিটিউট এর নদী উপকেন্দ্র স্থাপনের পর থেকেই প্রকৃত অর্থে লেকের মৎস্য সম্পদ বৃদ্ধিকল্পে প্রায়োগিক গবেষণা শুরু হয়েছে। ইতোমধ্যে গবেষণা ভিত্তিক গুরুত্বপূর্ণ ফলাফল, প্রযুক্তি উদ্ভাবন ও সহায়ক তথ্যাদি সংগ্রহে অনেকাংশেই সফলতা লাভ করেছে এবং এ লেকটির সম্ভবনাকে পুরোপুরি  কাজে লাগাতে কাপ্তাই লেকে মৎস্য উৎপাদন বৃদ্ধি, সংরক্ষণ ও ব্যবস্থাপনা জোরদারকরণ প্রকল্পের অর্থায়নে অত্যাধুনিক সুযোগ সুবিধা সম্বলিত অফিস কাম ল্যাবরেটরী নির্মাণ করা হয়েছে। ফলে লেক ভিত্তিক প্রায়োগিক গবেষণা কার্যক্রম জোরদারকরণ সম্ভব হবে । \n\n";
        String pish14 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas14 = "</body></html>";
        String myHtmlString14 = pish14 + myData14 + pas14;
        wv14.loadDataWithBaseURL(null,myHtmlString14, "text/html", "UTF-8", null);
    }
}
