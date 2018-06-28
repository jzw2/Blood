package com.drugdealers.blood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class RecordListActivity extends AppCompatActivity {

    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_list);


        mListView = findViewById(R.id.list_view);

        List<Record> list = Record.get();


        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.
        ArrayAdapter<Record> arrayAdapter = new ArrayAdapter<Record>(
                this,
                android.R.layout.simple_list_item_1,
                list);

        mListView.setAdapter(arrayAdapter);
    }
}
