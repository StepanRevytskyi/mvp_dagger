package com.arondillqs5328.daggermvpexample;

import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;

@Module
public class SharedPreferenceModule {

    private SharedPreferences mPreferences;

    public SharedPreferenceModule(SharedPreferences preferences) {
        mPreferences = preferences;
    }

    @Provides
    public SharedPreferences getPreferences() {
        return mPreferences;
    }
}
