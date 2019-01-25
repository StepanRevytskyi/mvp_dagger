package com.arondillqs5328.daggermvpexample;

import dagger.Module;
import dagger.Provides;

@Module(includes = SharedPreferenceModule.class)
public class MainPresenterModule {

    private final MainContract.View mView;

    public MainPresenterModule(MainContract.View view) {
        mView = view;
    }

    @Provides
    MainContract.View provideMainView() {
        return mView;
    }
}
