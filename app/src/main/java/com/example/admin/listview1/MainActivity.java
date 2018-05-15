package com.example.admin.listview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView list1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list1=findViewById(R.id.listname);
        String [] names = {"Jagrati", "Gaurav", "Gargi", "Bhumika", "Priyam", "Prashita","Ayushi"};
        ListAdapter myadapter = new CustomAdapter(this,names);
        list1.setAdapter(myadapter);

    }
}
