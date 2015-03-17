package com.example.dell.ilachujitodolist;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DELL on 3/16/2015.
 */
public class myAdapter extends ArrayAdapter<String>{

    public myAdapter(Context context, ArrayList<String> arrayList){
            super(context,0,arrayList);
    }


    @Override
    public View getView(int position, View v, ViewGroup vG){
        String item = getItem(position);
        if (v == null) {
            v = LayoutInflater.from(getContext()).inflate(R.layout.task_view, vG, false);
        }
        TextView todo = (TextView) v.findViewById(R.id.taskTextView);
        todo.setText(item);
        if(position%2==0){
            todo.setTextColor(Color.RED);
        }
        else{
            todo.setTextColor(Color.BLUE);
        }
        return v;
    }



}
