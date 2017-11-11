package com.cq4.javajunkies.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cq4.javajunkies.R;
import com.cq4.javajunkies.model.Classmates;
import com.cq4.javajunkies.model.view.ClassViewHolder;

import java.util.List;

/**
 * Created by melina.gonzalez on 11/11/17.
 */

public class JjClassAdapter extends RecyclerView.Adapter<ClassViewHolder> {

    private List<Classmates> jjList;

    public JjClassAdapter(List<Classmates> jjList) {
        this.jjList = jjList;
    }

    @Override
    public ClassViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.jjclassmates, parent, false);
        return new ClassViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(ClassViewHolder holder, int position) {
        Classmates person = jjList.get(position);

        holder.onBind(person);
    }



    @Override
    public int getItemCount() {
        return jjList.size();
    }
}
