package com.example.listviewtask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity --->";
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
        Log.d(TAG, "doMagic: ");
        new ListTask(this).execute();
        updateListView(addMainlist("1"));
        updateListView(addMainlist("2"));
        updateListView(addMainlist("3"));
    }

    public void updateListView(ArrayList<String> arrayList){
        Log.d(TAG, "updateListView: ");
        mArrayList.addAll(arrayList);
        mAdapter.notifyDataSetChanged();
    }

    public ArrayList<String> addMainlist(String str) {
        Log.d(TAG, "addMainlist: Start");
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello World"+str);
        arrayList.add("Bye World"+str);
        arrayList.add("Saulo rocks"+str);
        arrayList.add("Ben too"+str);
        arrayList.add("Mike rocks more"+str);
        arrayList.add("Etienne rocks even more"+str);

        Log.d(TAG, "addMainlist: End");
        return arrayList;
    }
}
