package com.example.biddutkarmakar.kaptainewcorrection;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ListView;

import java.util.ArrayList;

public class FishDisese extends AppCompatActivity {

    ListView lv;
    Context context;

    ArrayList prgmName;
    public static int [] prgmImages={R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow};
    public static String [] prgmNameList={" রোগ প্রতিরোধ কৌশল  "," ক্ষত রোগ বা আলসার ডিজিজ "," লেজ ও পাখনা পঁচা রোগে "," ফুলকা পঁচা রোগ "," পরজীবি জনিত  "," মাছের উঁকুন বা  আরগুলোসিস ",
            " পাঙ্গাসের লালচে দাগ রোগ "," কৈ মাছের ক্ষত রোগ "," শিং মাছের ব্যাকটেরিয়া জনিত রোগ "," তেলাপিয়ার স্টেপটোকক্কোসিস রোগ ",
            " পুষ্ঠিহীনতা জনিত রোগ "," জলাশয়ে অক্সিজেন স্বল্পতা, গ্যাসজনিত বিষক্রিয়া "," ছত্রাক জনিত রোগ "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_disese);

        context=this;

        lv=(ListView) findViewById(R.id.listview1);
        lv.setAdapter(new CustomAdapterDisese(this, prgmNameList,prgmImages));

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<b> মাছের রোগ ও প্রতিকার </b>"));

    }
}
