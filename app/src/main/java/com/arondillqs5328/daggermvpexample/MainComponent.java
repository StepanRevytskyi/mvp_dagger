package com.arondillqs5328.daggermvpexample;

import dagger.Component;

@Component(modules = {MainPresenterModule.class})
public interface MainComponent {

    void inject(MainActivity mainActivity);

}
