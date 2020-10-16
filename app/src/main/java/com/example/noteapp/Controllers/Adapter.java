package com.example.noteapp.Controllers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.noteapp.MainActivity;
import com.example.noteapp.Models.Note;
import com.example.noteapp.R;

import java.util.List;
import java.util.function.ToDoubleBiFunction;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<Note> notesList;

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView noteName;
        public TextView noteID;
        public ImageButton noteChange;
        public ConstraintLayout subLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            noteName = itemView.findViewById(R.id.noteTitle);
            noteID = itemView.findViewById(R.id.noteId);
            noteChange = itemView.findViewById(R.id.expandMore);
            subLayout = itemView.findViewById(R.id.subLayout);
        }
    }

    //constructor
    public Adapter(List<Note> notesList)
    {
        this.notesList = notesList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View listView = layoutInflater.inflate(R.layout.recycler_item_main, parent, false);
        ViewHolder viewHolder = new ViewHolder(listView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final Adapter.ViewHolder holder, final int position) {
        //let's get our model based on position
        final Note note = notesList.get(position);

        //set itemviews
        TextView noteName = holder.noteName;
        noteName.setText(note.getName());

        TextView noteID = holder.noteID;
        noteID.setText(String.valueOf(note.getId()));

        //we are checking if user clicks on icon to expand item for recyclerview
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean expanded = note.isExpanded();
                expanded = !expanded;
                notifyItemChanged(position);

            }
        });


    }

    private void bind(Note note){
        //lets check actual state
        boolean expanded = note.isExpanded();
        //set visibility based on state
        //depending on value of expanded var it gives different outputs, first if its true, second if its false

        //TODO: 16.10.2020 check how get access to layout object
        //subLayout  (expanded ? View.VISIBLE: View.GONE);
    }

    @Override
    public int getItemCount() {
        return notesList.size();
    }
}
