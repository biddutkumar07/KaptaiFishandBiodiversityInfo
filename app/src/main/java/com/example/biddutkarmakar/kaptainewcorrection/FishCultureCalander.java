package com.example.biddutkarmakar.kaptainewcorrection;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FishCultureCalander extends AppCompatActivity {

    ListView lv;
    Context context;

    ArrayList prgmName;
    public static int [] prgmImages={R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow};
    public static String [] prgmNameList={" মাছ চাষের বর্ষপঞ্জী ", " মাছ চাষে নিয়মিত করণীয় "," পুকুরে মিশ্র মাছ চাষ "," পাহাড়ী ঘোনা/ক্রিকে কার্পজাতীয় মাছের মিশ্র চাষ ব্যবস্থাপনা ",
            " কাপ্তাই লেকে পাহাড়ী ঘোনা/ক্রিকে কার্প জাতীয় মাছের পোনা উৎপাদনের কৌশল "," কাপ্তাই লেকে ভাসমান খাঁচায় মনোসেক্স তেলাপিয়া মাছ চাষ  "," শিং মাছের চাষ ব্যবস্থাপনা "," পাবদা মাছের চাষ ব্যবস্থাপনা ",
            " কৈ মাছের চাষ ব্যবস্থাপনা "," পুকুরে মনোসেক্স তেলাপিয়া মাছের চাষ ব্যবস্থাপনা "," মাছ চাষে  ব্যবহৃত  বিভিন্ন  একক ও রূপান্তর "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_culture_calander);

        context=this;

        lv=(ListView) findViewById(R.id.listview1);
        lv.setAdapter(new CustomadapterCalander(this, prgmNameList,prgmImages));

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<b> মাছ চাষ ব্যবস্থাপনা  </b>"));
    }
}
