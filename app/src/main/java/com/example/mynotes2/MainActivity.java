package com.example.mynotes2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        List<String> noteList = new ArrayList<>();
        noteList.add("tekstas 01");
        noteList.add("tekstas 02");
        noteList.add("tekstas 03");
        noteList.add("tekstas 04");
        noteList.add("tekstas 05");

        // Adaptor
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                noteList
        );

        // lsit view
        ListView listView = findViewById(R.id.noteListview);
        listView.setAdapter(arrayAdapter);


    }
}