package com.itdawn.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {

    ImageView personImage;
    TextView personName, personInfo;

    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        //

        personName = itemView.findViewById(R.id.personName);
        personInfo = itemView.findViewById(R.id.personInfo);
        personImage = itemView.findViewById(R.id.personImage);
    }
}
