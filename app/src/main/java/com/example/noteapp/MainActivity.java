package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.noteapp.Controllers.Adapter;
import com.example.noteapp.Models.Note;
import com.example.noteapp.Views.EditNote;
import com.example.noteapp.Views.NewNote;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageButton changeNoteSize;
    ImageButton editNote;
    ArrayList<Note> notes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.notes_list);



        //for tests
        Note note =  new Note(1, "Shopping List", "desc");
        notes.add(note);

        Note note2 = new Note(2,"To Do", "desc");
        notes.add(note2);

        Adapter adapter = new Adapter(notes);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }


    public void addNote(View view) {
        Intent intent = new Intent(MainActivity.this , NewNote.class);
        startActivity(intent);
    }

    public void changeNoteSize(View view){


        /*if(ContextCompat.getDrawable(this, R.drawable.ic_baseline_expand_more_24) == changeNoteSize.getDrawable())
        {
            Toast.makeText(MainActivity.this, "expanded note!",
                    Toast.LENGTH_SHORT).show();
        }*/


    }

    public void editNote(View view){
        Toast.makeText(MainActivity.this, "edit note!",
                Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, EditNote.class);



    }
}


