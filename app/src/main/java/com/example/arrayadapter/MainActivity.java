package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] name = {"Google", "Amazon", "Apple", "Meta", "Youtube", "Snapchat", "Netflix", "Microsoft"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new  ArrayAdapter<String>(getApplicationContext(), R.layout.text_view , R.id.text_view_id , name);
        listView.setAdapter(arrayAdapter);

    }
}