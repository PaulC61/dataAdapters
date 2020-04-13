package com.example.dataadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] names = new String[10];
        names [0] = "Paul";
        names [1] = "Kanya";
        names [2] = "Peter";
        names [3] = "Nadine";
        names [4] = "Lourenco";
        names [5] = "Emiliano";
        names [6] = "Rodrigo";
        names [7] = "Danilo";
        names [8] = "Rainer";
        names [9] = "Felipe";

        ArrayAdapter<String> studentNamesAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        ListView studentListView = (ListView) findViewById(R.id.studentList);
        studentListView.setAdapter(studentNamesAdapter);

    }
}
