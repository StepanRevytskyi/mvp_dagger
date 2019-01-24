package com.arondillqs5328.daggermvpexample;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Scope;
import javax.inject.Singleton;

public class MainPresenter implements MainContract.Presenter{

    private MainModel mMainModel;
    private MainContract.View mView;

    @Inject
    public MainPresenter(MainContract.View view, Context context) {

        Log.i("TAG_Log", "create presenter");
        mView = view;
        mMainModel = new MainModel(this, context);
    }


    @Override
    public void loadMessage() {
        mMainModel.generateMessage();
    }

    @Override
    public void setMessage(String message) {
        mView.showMessage(message);
    }
}
