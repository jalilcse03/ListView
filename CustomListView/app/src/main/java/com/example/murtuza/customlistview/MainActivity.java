package com.example.murtuza.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<PersonModel>personModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listView);

        personModelArrayList=new ArrayList<>();

        PersonModel personModel=new PersonModel();
        personModel.setName("Jalilur");
        personModel.setAddress("Mirpur");

        PersonModel personModel2=new PersonModel();
        personModel2.setName("Murtuza");
        personModel2.setAddress("Thakurgaon");

        PersonModel personModel3=new PersonModel();
        personModel3.setName("Rakib Hossain");
        personModel3.setAddress("Nator");

        PersonModel personModel4=new PersonModel();
        personModel4.setName("Mahabubul Islam");
        personModel4.setAddress("Nator");

        PersonModel personModel5=new PersonModel();
        personModel5.setName("Mahi");
        personModel5.setAddress("Feni");

        PersonModel personModel6=new PersonModel();
        personModel6.setName("Mithu Kumar Holder");
        personModel6.setAddress("Sundorbon");

        personModelArrayList.add(personModel);
        personModelArrayList.add(personModel2);
        personModelArrayList.add(personModel3);
        personModelArrayList.add(personModel4);
        personModelArrayList.add(personModel5);
        personModelArrayList.add(personModel6);


        AdapterForPerson adapterForPerson=new AdapterForPerson(getApplicationContext(),personModelArrayList);

        listView.setAdapter(adapterForPerson);
    }
}
