package com.arondillqs5328.daggermvpexample;

import android.content.SharedPreferences;
import android.util.Log;

public class MainModel implements MainContract.Model {

    private SharedPreferences mPreferences;
    private MainModelCallback mCallback;

    public MainModel(SharedPreferences sharedPreferences) {
        Log.i("TAG_Log", "create model");
        mPreferences = sharedPreferences;
    }

    public void setRepositoryCallback(MainModelCallback callback) {
        mCallback = callback;
    }

    @Override
    public void generateMessage() {
        if (mPreferences != null) {
            Log.i("TAG_L", "прокинулось");
        } else {
            Log.i("TAG_L", "не прокинулось");
        }
        mCallback.onGeneratedMessage("РОБИТЬ");
    }
}
