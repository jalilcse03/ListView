package com.example.murtuza.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Murtuza on 3/5/2016.
 */
public class AdapterForPerson extends ArrayAdapter<PersonModel>{
    ArrayList<PersonModel>personModelArrayList;
    private Context context;

    public AdapterForPerson(Context context, ArrayList<PersonModel>personModelArrayList) {
        super(context,R.layout.custom_row,personModelArrayList);
        this.context=context;
        this.personModelArrayList=personModelArrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View view=convertView;
        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=layoutInflater.inflate(R.layout.custom_row,null);
        TextView nameTv=(TextView)view.findViewById(R.id.nameTv);
        TextView addressTv=(TextView)view.findViewById(R.id.addressTv);

        nameTv.setText(personModelArrayList.get(position).getName());
        addressTv.setText(personModelArrayList.get(position).getAddress());

        return view;
    }
}
