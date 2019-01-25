package com.arondillqs5328.daggermvpexample;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private Button mButton;

    @Inject MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent
                .builder()
                .mainPresenterModule(new MainPresenterModule(this))
                .sharedPreferenceModule(new SharedPreferenceModule(getSharedPreferences("settings", Context.MODE_PRIVATE)))
                .build()
                .inject(this);


        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainPresenter.loadMessage();
            }
        });
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        mMainPresenter.detachView();
        super.onDestroy();
    }
}
