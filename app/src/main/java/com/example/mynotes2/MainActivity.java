package com.example.mynotes2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Data
        List<Note> noteList = new ArrayList<>();

        Note note1 = new Note(1, "name_01", "conten_01");
        noteList.add(note1);

        Note note2 = new Note(2, "name_02", "conten_02");
        noteList.add(note2);

        Note note3 = new Note(3, "name_03", "conten_03");
        noteList.add(note3);

        Note note4 = new Note(4, "name_04", "conten_04");
        noteList.add(note4);

        Note note5 = new Note(5, "name_05", "conten_05");
        noteList.add(note5);


        // Adaptor
        ArrayAdapter<Note> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                noteList
        );

        // lsit view
        ListView listView = findViewById(R.id.noteListview);
        listView.setAdapter(arrayAdapter);


        AdapterView.OnItemClickListener clickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                System.out.println("Click " + position);
                Log.i("Click ", "onItemClick: "+position);

            }
        };
        listView.setOnItemClickListener(clickListener);


    }
}