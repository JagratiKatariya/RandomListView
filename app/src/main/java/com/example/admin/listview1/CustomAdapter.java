package com.example.admin.listview1;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class CustomAdapter extends ArrayAdapter<String> {
    public CustomAdapter(@NonNull Context context, String [] name) {
        super(context, R.layout.custom_main,name);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater myinflator = LayoutInflater.from(getContext());
        View customview = myinflator.inflate(R.layout.custom_main,parent,false);
        String nameposition = getItem(position);
        ImageView img = customview.findViewById(R.id.imgcircle);
        TextView textname = customview.findViewById(R.id.textname);
        TextView textinitial = customview.findViewById(R.id.textinitial);
        textname.setText(nameposition);
        char s = nameposition.charAt(0);
        Log.d("DEBUG",s+"");
        textinitial.setText(s+"");
        Random random = new Random();

        int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        img.setColorFilter(color);
        for(int i=0; i<=position;i++)
        {
            if(i%2==0)
            {
                customview.setBackgroundColor(Color.LTGRAY);
            }
            else
            {
                customview.setBackgroundColor(Color.WHITE);
            }
        }
        return customview;

    }
}
