package com.cq4.javajunkies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cq4.javajunkies.controller.JjClassAdapter;
import com.cq4.javajunkies.model.Classmates;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView javaJunkiesRecycler = (RecyclerView) findViewById(R.id.jj_recyclerview);


        List<Classmates> javajunkies = new ArrayList<>();

        javajunkies.add(new Classmates(R.drawable.volha,"Volha", "December 20th", "Sagittarius", "White"));
        javajunkies.add(new Classmates(R.drawable.mel,"Mel", "April 10th", "Aries", "Green"));
        javajunkies.add(new Classmates(R.drawable.bobby,"Bobby", "July 3rd", "Cancer", "Red"));
        javajunkies.add(new Classmates(R.drawable.amyrivera,"Amy", "May 9th", "Taurus", "Green"));
        javajunkies.add(new Classmates(R.drawable.murad,"Murad", "December 1st", "Sagittarius", "White"));
        javajunkies.add(new Classmates(R.drawable.monaz,"Mo Naz", "July 2nd","Cancer", "Orange"));

        JjClassAdapter jjClassAdapter = new JjClassAdapter(javajunkies);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        javaJunkiesRecycler.setLayoutManager(linearLayoutManager);
        javaJunkiesRecycler.setAdapter(jjClassAdapter);
    }
}

