package com.itdawn.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Person> personList;

    RecyclerView personRecycler;
    PersonRecyclerAdapter personRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //

        personRecycler = findViewById(R.id.personRecycler);
        personRecycler.setHasFixedSize(true);
        //

        setData();

        personRecyclerAdapter = new PersonRecyclerAdapter(personList, this);
        personRecycler.setAdapter(personRecyclerAdapter);
    }

    private void setData() {
        personList = new ArrayList<>();
        personList.add(new Person(1, "Ahmed", "Programmer", R.drawable.img));
        personList.add(new Person(2, "Mohammed", "Programmer", R.drawable.img_1));
        personList.add(new Person(3, "Aya", "Programmer", R.drawable.img_2));
        personList.add(new Person(4, "Ali", "Programmer", R.drawable.img_3));
        personList.add(new Person(5, "Sura", "Programmer", R.drawable.img_4));
    }
}