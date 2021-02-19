package com.example.customlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lstData;
    ArrayAdapter<String> adapter;
    ArrayList<Item> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstData = findViewById(R.id.lstData);
        list = generatedata();

        MyAdapter myAdapter = new MyAdapter(this, list);
        lstData.setAdapter(myAdapter);
    }


    private ArrayList<Item> generatedata() {
        ArrayList<Item> list = new ArrayList<Item>();

        list.add(new Item ("Disha","1/1/2021","1","11:00",R.drawable.incomingcall));
        list.add(new Item ("komal","2/1/2021","2","12:00",R.drawable.missedcall));
        list.add(new Item ("Monali","1/1/2021","1","01:00",R.drawable.incomingcall));
        list.add(new Item ("Papa","1/1/2021","1","13:00",R.drawable.incomingcall));
        return list;
    }
}


