package com.example.biddutkarmakar.kaptainewcorrection;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.webkit.WebView;

public class FishCultureCalanderList6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_culture_calander_list6);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<b> খাঁচায় মনোসেক্স তেলাপিয়া মাছ চাষ  </b>"));

        WebView wv = (WebView) findViewById(R.id.webView1);
        wv.loadUrl("file:///assets/demo/my_page.html");
        wv.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData = " খাঁচা তৈরীর উপকরণ \n\n";
        String pish = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas = "</body></html>";
        String myHtmlString = pish + myData + pas;
        wv.loadDataWithBaseURL(null,myHtmlString, "text/html", "UTF-8", null);

        WebView wv2 = (WebView) findViewById(R.id.webView2);
        wv2.loadUrl("file:///assets/demo/my_page.html");
        //wv2.setBackgroundColor(Color.parseColor("#919191"));
        String myData2 = " খাঁচা তৈরীর জন্য ১.০  সেমি. ফাঁসের নটলেস জাল, ড্রাম, বাঁশ, নাইলন রশি, খাঁচার উপরিতল ঢাকার জন্য টায়ার কডের জাল ব্যবহার করা উত্তম । \n\n\n";
        String pish2 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas2 = "</body></html>";
        String myHtmlString2 = pish2 + myData2 + pas2;
        wv2.loadDataWithBaseURL(null,myHtmlString2, "text/html", "UTF-8", null);

        WebView wv3 = (WebView) findViewById(R.id.webView3);
        wv3.loadUrl("file:///assets/demo/my_page.html");
        wv3.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData3 = " খাঁচা প্রস্তুতকরণ \n\n";
        String pish3 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas3 = "</body></html>";
        String myHtmlString3 = pish3 + myData3 + pas3;
        wv3.loadDataWithBaseURL(null,myHtmlString3, "text/html", "UTF-8", null);

        WebView wv4 = (WebView) findViewById(R.id.webView4);
        wv4.loadUrl("file:///assets/demo/my_page.html");
        String myData4 = " সাধারনত ৩×৩×২ ঘনমিটার আকারের জালের খাঁচা মনোসেক্স তেলাপিয়া মাছ চাষের জন্য ব্যবহার ভাল। কারন অপেক্ষাকৃত ছোট আকারের জালের খাঁচায় মাছ চাষের ক্ষেত্রে ব্যবস্থাপনা সহজ হয়। যে মাপের খাঁচা তৈরী করা হবে সে মাপের প্লাষ্টিক রশি নিয়ে প্রথমে একটা খাঁচার আকৃতি তৈরী করতে হবে। তারপর খাঁচার তলদেশ এবং এর চারপাশে খাঁচা তৈরীর জাল টায়ার কড সুতা দিয়ে সেলাই করে আটকে দিতে হবে। অতঃপর উপরিতলে ঢাকনা জাল সেলাই করে দিতে হবে । \n\n";
        String pish4 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas4 = "</body></html>";
        String myHtmlString4 = pish4 + myData4 + pas4;
        wv4.loadDataWithBaseURL(null,myHtmlString4, "text/html", "UTF-8", null);

        WebView wv5 = (WebView) findViewById(R.id.webView5);
        wv5.loadUrl("file:///assets/demo/my_page.html");
        wv5.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData5 = " খাঁচা স্থাপন পদ্ধতি  \n\n";
        String pish5 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas5 = "</body></html>";
        String myHtmlString5 = pish5 + myData5 + pas5;
        wv5.loadDataWithBaseURL(null,myHtmlString5, "text/html", "UTF-8", null);

        WebView wv6 = (WebView) findViewById(R.id.webView6);
        wv6.loadUrl("file:///assets/demo/my_page.html");
        String myData6 = " খাঁচা স্থাপনের জন্য খাঁচার মাপে জিআই পাইপ অথবা বাঁশের তৈরী ফ্রেম, প্লাষ্টিকের ড্রামের সাথে বেঁধে পানিতে ভাসাতে হবে। তারপর খাঁচার চার কোণায় প্লাষ্টিক রশির লুপ বেঁধে ফ্রেমের সাথে জাল পানিতে স্থাপন করতে হবে। খাঁচার তলদেশের চার কোণায় ইট বেঁধে দিতে হবে যাতে খাঁচা টান টান হয়ে থাকে । \n\n";
        String pish6 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas6 = "</body></html>";
        String myHtmlString6 = pish6 + myData6 + pas6;
        wv6.loadDataWithBaseURL(null,myHtmlString6, "text/html", "UTF-8", null);

        WebView wv7 = (WebView) findViewById(R.id.webView7);
        wv7.loadUrl("file:///assets/demo/my_page.html");
        wv7.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData7 = " খাঁচায় মনোসেক্স তেলাপিয়ার মাছের পোনা মজুদকরণ  \n\n";
        String pish7 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas7 = "</body></html>";
        String myHtmlString7 = pish7 + myData7 + pas7;
        wv7.loadDataWithBaseURL(null,myHtmlString7, "text/html", "UTF-8", null);

        WebView wv8 = (WebView) findViewById(R.id.webView8);
        wv8.loadUrl("file:///assets/demo/my_page.html");
        String myData8 = " মজুদ খাঁচায় পোনা চাষের ক্ষেত্রে পোনার ওজন কমপক্ষে গড়ে ১৫-২০ গ্রাম হওয়া প্রয়োজন। তবে গবেষণায় দেখা গেছে মজুদ খাঁচায় প্রতি ঘনমিটারে গড়ে ১৫ গ্রাম আকারের মনোসেক্স তেলাপিয়া ৫০ টি করে সুস্থ সবল আঙ্গুলি পোনা ১২০ দিন (৪ মাস) চাষ করে ভাল ফল পাওয়া যায়। মনে রাখতে হবে মজুদ খাঁচায় মাছ ছাড়ার পূর্বে ছোট ফাঁসের নার্সারী খাঁচায় পোনাগুলো অন্ততঃ ১ মাস লালন করে নিলে মজুদ খাঁচায় আঙ্গুলি পোনা মজুদের পরে মৃত্যুর হার খুবই কম হয়। এক্ষেত্রে খাঁচায় মজুদের পূর্বের ১ দিন আগে থেকে পোনাকে খাবার দেয়া বন্ধ রাখতে হবে এবং মজুদকরণের অন্ততঃ ৪-৫ ঘন্টা পরে একটু একটু করে খাবার দিতে হবে । \n\n";
        String pish8 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas8 = "</body></html>";
        String myHtmlString8 = pish8 + myData8 + pas8;
        wv8.loadDataWithBaseURL(null,myHtmlString8, "text/html", "UTF-8", null);

        WebView wv9 = (WebView) findViewById(R.id.webView9);
        wv9.loadUrl("file:///assets/demo/my_page.html");
        wv9.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData9 = " খাঁচায় মনোসেক্স তেলাপিয়া মাছে খাদ্য ও প্রয়োগ পদ্ধতি \n\n";
        String pish9 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas9 = "</body></html>";
        String myHtmlString9 = pish9 + myData9 + pas9;
        wv9.loadDataWithBaseURL(null,myHtmlString9, "text/html", "UTF-8", null);

        WebView wv10 = (WebView) findViewById(R.id.webView10);
        wv10.loadUrl("file:///assets/demo/my_page.html");
        String myData10 = " লাভজনকভাবে খাঁচায় মাছ চাষের জন্য খাদ্য নির্বাচন ও প্রয়োগ অন্যতম প্রধান বিবেচ্য বিষয়। খাঁচায় তেলাপিয়া চাষের ক্ষেত্রে সম্পূরক খাদ্যের শতকরা ২৮-৩০% প্রোটিন থাকা উত্তম। কারখানায় উৎপাদিত পিলেট এবং স্থানীয়ভাবে তৈরী উভয় প্রকার খাদ্যই খাঁচায় ব্যবহার করা যায়। অধিক উৎপাদনের লক্ষ্যে ভাসমান পিলেট জাতীয় খাদ্য বেশী উপযোগী।  নার্সারী অবস্থায়  মনোসেক্স তেলাপিয়া মাছের পোনার দেহ ওজনের ১৫% হিসেবে খাদ্য প্রয়োগ করতে হবে। চাষকালীন প্রথম দুই মাস ৮-১০% এবং শেষ দুই মাস ৫-৭% হিসেবে খাদ্য প্রয়োগ করতে হবে । \n\n";
        String pish10 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas10 = "</body></html>";
        String myHtmlString10 = pish10 + myData10 + pas10;
        wv10.loadDataWithBaseURL(null,myHtmlString10, "text/html", "UTF-8", null);

        WebView wv11 = (WebView) findViewById(R.id.webView11);
        wv11.loadUrl("file:///assets/demo/my_page.html");
        wv11.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData11 = " ভাসমান খাঁচার পরিচর্যা  \n\n";
        String pish11 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas11 = "</body></html>";
        String myHtmlString11 = pish11 + myData11 + pas11;
        wv11.loadDataWithBaseURL(null,myHtmlString11, "text/html", "UTF-8", null);

        WebView wv12 = (WebView) findViewById(R.id.webView12);
        wv12.loadUrl("file:///assets/demo/my_page.html");
        String myData12 = " যেহেতু উম্মুক্ত জলাশয়ে অধিক ঘনত্বে খাঁচায় মাছ চাষ হয় সেহেতু জলাশয়ের শেওলাসহ বিভিন্ন ধরণের কীটপতঙ্গ ও পরজীবি জালের খাঁচাকে আশ্রয় হিসেবে ব্যবহার করে ফলে জালে ফাঁস দিয়ে পানি প্রবাহ কমে যায়। এতে করে খাঁচার মাছ রোগ দ্বারা আক্রান্ত হতে পারে। সে জন্য মাছ চাষের খাঁচা মাসে অন্ততঃ একবার ব্রাশ দিয়ে পরিস্কার করা প্রয়োজন। খাঁচায় ভাসমান খাদ্য ব্যতিত অন্য যে কোন ধরণের ডুবন্ত খাদ্য সরবরাহ করলে খাঁচার তলদেশের অব্যবহৃত খাদ্য নিয়মিত পরিস্কার করে খাঁচার পরিবেশ দূষণমুক্ত রাখতে হবে। স্রোতে ভেসে আসা কচুরিপানা/জলজ উদ্ভিদ যেন খাঁচার বাহিরে জমা হয়ে পানি প্রবাহ কমিয়ে না দেয় সে দিকে লক্ষ্য রাখতে হবে। \n\n";
        String pish12 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas12 = "</body></html>";
        String myHtmlString12 = pish12 + myData12 + pas12;
        wv12.loadDataWithBaseURL(null,myHtmlString12, "text/html", "UTF-8", null);

        WebView wv13 = (WebView) findViewById(R.id.webView13);
        wv13.loadUrl("file:///assets/demo/my_page.html");
        wv13.setBackgroundColor(Color.parseColor("#FF9800"));
        String myData13 = " মাছ আহরণ ও বাজারজাতকরণ  \n\n";
        String pish13 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas13 = "</body></html>";
        String myHtmlString13 = pish13 + myData13 + pas13;
        wv13.loadDataWithBaseURL(null,myHtmlString13, "text/html", "UTF-8", null);


        WebView wv14 = (WebView) findViewById(R.id.webView14);
        wv14.loadUrl("file:///assets/demo/my_page.html");
        String myData14 = " বাজার চাহিদা অনুযায়ী যে কোন সময় নূন্যতম খরচ ও পরিশ্রমে খাঁচার মাছ আহরণ করা যায়। খাঁচার মাছ আহরণের জন্য স্কুপনেট ছাড়া তেমন কোন উপকরণের প্রয়োজন পড়ে না। খাঁচার মাছ একত্রে আহরণ আপেক্ষা মজুদ খাঁচার ৩-৪ মাস অতিবাহিত হওয়ায় পর থেকে ৬ মাস পর্যন্ত বেছে বেছে আহরণ করলে অধিক লাভবান হওয়ায় যায়। যাতায়াত ব্যবস্থা ভাল হলে দ্রুত তাজা মাছ বাজারে নিয়ে বিক্রয় করলে অধিক দাম পাওয়া যায় । \n\n";
        String pish14 = "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///assets/font/SolaimanLipi-8-Jan-2011.ttf\")}body {font-family: MyFont;font-size: medium;text-align: justify;}</style></head><body>";
        String pas14 = "</body></html>";
        String myHtmlString14 = pish14 + myData14 + pas14;
        wv14.loadDataWithBaseURL(null,myHtmlString14, "text/html", "UTF-8", null);


    }
}
