package com.example.listviewtask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mArrayList;
    private ArrayAdapter<String> mAdapter;

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.a_main_list_1);

        mArrayList = new ArrayList<>();
        mAdapter = new ArrayAdapter<String>(this, R.layout.item_list, mArrayList);

        mListView.setAdapter(mAdapter);
    }

    public void doMagic(View view) {
        new ListTask(this).execute();
    }

    public void updateListView(ArrayList<String> arrayList){
        mArrayList.addAll(arrayList);
        mAdapter.notifyDataSetChanged();
    }
}
