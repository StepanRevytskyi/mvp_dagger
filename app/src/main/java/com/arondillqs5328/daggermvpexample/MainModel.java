package com.arondillqs5328.daggermvpexample;


import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

public class MainModel implements MainContract.Model {

    private MainPresenter mMainPresenter;
    private Context mContext;

    public MainModel(MainPresenter mainPresenter, Context context) {
        Log.i("TAG_Log", "create model");
        mMainPresenter = mainPresenter;
        mContext = context;
    }

    @Override
    public void generateMessage() {
        if (mContext != null) {
            Log.i("TAG_L", "прокинулось");
        } else {
            Log.i("TAG_L", "не прокинулось");
        }
        mMainPresenter.setMessage("РОБИТЬ");
    }
}
