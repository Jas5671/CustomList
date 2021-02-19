package com.example.customlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Item> list;

    public MyAdapter(Context context, ArrayList<Item> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.listitem, parent, false);

        TextView txtname = (TextView) rowView.findViewById(R.id.txtname);
        TextView date = (TextView) rowView.findViewById(R.id.date);
        ImageView img = (ImageView) rowView.findViewById(R.id.img);
        TextView number = (TextView) rowView.findViewById(R.id.number);
        TextView time = (TextView) rowView.findViewById(R.id.time);

        txtname.setText(list.get(position).getName());
        date.setText(list.get(position).getDate());
        img.setBackgroundResource(list.get(position).getImage());
        number.setText(list.get(position).getNumber());
        time.setText(list.get(position).getTime());



        return rowView;
    }
}




