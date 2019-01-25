package com.arondillqs5328.daggermvpexample;

import android.content.SharedPreferences;
import android.util.Log;

import javax.inject.Inject;

public class MainPresenter implements MainContract.Presenter, MainModelCallback {

    private MainModel mMainModel;
    private MainContract.View mView;

    @Inject
    public MainPresenter(MainContract.View view, SharedPreferences sharedPreferences) {
        Log.i("TAG_Log", "create presenter");
        mView = view;
        mMainModel = new MainModel(sharedPreferences);
        mMainModel.setRepositoryCallback(this);
    }

    @Override
    public void loadMessage() {
        mMainModel.generateMessage();
    }

    @Override
    public void onGeneratedMessage(String message) {
        mView.showMessage(message);
    }
}
