package com.cq4.javajunkies.model.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cq4.javajunkies.R;
import com.cq4.javajunkies.model.Classmates;
import com.squareup.picasso.Picasso;

/**
 * Created by melina.gonzalez on 11/11/17.
 */


public class ClassViewHolder extends RecyclerView.ViewHolder {
    private Context context;
    private TextView name;
    private TextView dateOfBirth;
    private TextView color;
    private TextView horoscope;
    private ImageView picture;

    public ClassViewHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.jj_name);
        dateOfBirth = (TextView) itemView.findViewById(R.id.jj_dateofbirth);
        color = (TextView) itemView.findViewById(R.id.jj_color);
        horoscope = (TextView) itemView.findViewById(R.id.jj_horoscope);
        picture = (ImageView) itemView.findViewById(R.id.person_pic);
    }

    public void onBind(Classmates person) {
        context = itemView.getContext();
        name.setText(person.getName());
        dateOfBirth.setText("Date of Birth: " + person.getDateofBirth());
        horoscope.setText("Horoscope: " + person.getHoroscope());
        color.setText("Favorite Color: " + person.getColor());
        Log.d("img", "onBind: img id: " + person.getImageResource());
        Picasso.with(context).load(person.getImageResource()).into(picture);
    }
}
