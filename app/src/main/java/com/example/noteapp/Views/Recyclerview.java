package com.example.noteapp.Views;

import android.content.Context;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.noteapp.MainActivity;
import com.example.noteapp.Models.Note;
import com.example.noteapp.R;

import java.util.List;


public class Recyclerview extends MainActivity {
    private Context context;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.notes_list);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    public Recyclerview(RecyclerView recyclerView, Context context, List<Note> Notes ) {

        this.recyclerView = recyclerView;
        layoutManager = new LinearLayoutManager(context);


    }
}
