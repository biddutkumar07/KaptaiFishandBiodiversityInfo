package com.example.biddutkarmakar.kaptainewcorrection;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ListView;

import java.util.ArrayList;

public class FishBioversity extends AppCompatActivity {

    ListView lv;
    Context context;

    ArrayList prgmName;
    public static int [] prgmImages={R.drawable.arrow,R.drawable.arrow,R.drawable.arrow};
    public static String [] prgmNameList={" মাৎস্য প্রজাতির সংখ্যা "," বাণিজ্যিক গুরুত্ব সম্পন্ন মৎস্য প্রজাতি "," মৎস্য জীব-বৈচিত্র্য পরিবর্তন "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_bioversity);

        context=this;
        lv=(ListView) findViewById(R.id.listview1);
        lv.setAdapter(new CustomAdapterBioversity(this, prgmNameList,prgmImages));


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<b>  মৎস্য জীব-বৈচিত্র্য    </b>"));
    }
}
