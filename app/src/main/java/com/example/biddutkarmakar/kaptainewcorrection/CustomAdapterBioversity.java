package com.example.biddutkarmakar.kaptainewcorrection;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class CustomAdapterBioversity extends BaseAdapter {
    String[] result;
    Context context;
    int[] imageId;
    TextView tvi;
    LayoutInflater lif;
    ImageView sideArrow;

    public CustomAdapterBioversity(Context ctx) {
        lif = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //AssetManager assetManager = getAssets();
    private static LayoutInflater inflater = null;

    public CustomAdapterBioversity(FishBioversity fishBioversity, String[] prgmNameList, int[] prgmImages) {
        // TODO Auto-generated constructor stub
        result = prgmNameList;
        context = fishBioversity;
        imageId = prgmImages;
        inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub

        return position;
    }


    public class Holder {
        TextView tv;
        ImageView img;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        final Holder holder = new Holder();
        final View rowView;
        String fontPath1 = "fonts/SolaimanLipi-8-Jan-2011.ttf";
        rowView = inflater.inflate(R.layout.program_list, null);
        holder.tv = (TextView) rowView.findViewById(R.id.textView1);
        holder.img = (ImageView) rowView.findViewById(R.id.imageView1);
        final Typeface tvFont = Typeface.createFromAsset(context.getAssets(), fontPath1);
        holder.tv.setTypeface(tvFont);
        holder.tv.setText(result[position]);
        holder.tv.setTextColor(Color.WHITE);
        holder.img.setImageResource(imageId[position]);


        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                // Toast.makeText(context, "You Clicked "+result[position]+position, Toast.LENGTH_LONG).show();


                //View parentRow = (View) v.getParent();
                ListView listView = (ListView) rowView.getParent();
                final int pos = listView.getPositionForView(rowView);

                switch (pos) {
                    case 0:
                        v.getContext().startActivity(new Intent(context, FishBioversityList1.class));
                        break;
                    case 1:
                        v.getContext().startActivity(new Intent(context,FishBioversityList2.class));
                        break;
                    case 2:
                        v.getContext().startActivity(new Intent(context, FishBioversityList3.class));
                        break;


                }

            }
        });


        return rowView;
    }

}
