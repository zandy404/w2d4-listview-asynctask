package com.example.listviewtask;

import android.os.AsyncTask;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by evin on 4/7/16.
 */
public class ListTask extends AsyncTask<Void, Void, ArrayList<String>> {

    private static final String TAG = "ListTask --->";
    private MainActivity mMainActivity;

    ListTask(MainActivity mainActivity){

        mMainActivity = mainActivity;
    }

    @Override
    protected ArrayList<String> doInBackground(Void... params) {
        Log.d(TAG, "doInBackground: Start");
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello World");
        arrayList.add("Bye World");
        arrayList.add("Saulo rocks");
        arrayList.add("Ben too");
        arrayList.add("Mike rocks more");
        arrayList.add("Etienne rocks even more");

        Log.d(TAG, "doInBackground: End");
        return arrayList;
    }

    @Override
    protected void onPostExecute(ArrayList<String> arrayList) {
        super.onPostExecute(arrayList);
        Log.d(TAG, "onPostExecute: ");
        if (mMainActivity != null){
            mMainActivity.updateListView(arrayList);
        }
    }
}
