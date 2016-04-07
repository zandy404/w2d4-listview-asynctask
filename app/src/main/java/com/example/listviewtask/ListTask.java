package com.example.listviewtask;

import android.os.AsyncTask;

import java.util.ArrayList;

/**
 * Created by evin on 4/7/16.
 */
public class ListTask extends AsyncTask<Void, Void, ArrayList<String>> {

    private MainActivity mMainActivity;

    ListTask(MainActivity mainActivity){
     mMainActivity = mainActivity;
    }

    @Override
    protected ArrayList<String> doInBackground(Void... params) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello World");
        arrayList.add("Bye World");
        arrayList.add("Saulo rocks");
        arrayList.add("Ben too");
        arrayList.add("Mike rocks more");
        arrayList.add("Etienne rocks even more");

        return arrayList;
    }

    @Override
    protected void onPostExecute(ArrayList<String> arrayList) {
        super.onPostExecute(arrayList);

        mMainActivity.updateListView(arrayList);
    }
}
