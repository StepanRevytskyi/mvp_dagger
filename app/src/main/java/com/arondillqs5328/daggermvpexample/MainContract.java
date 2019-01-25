package com.arondillqs5328.daggermvpexample;

public interface MainContract {

    interface View {
        void showMessage(String message);
    }

    interface Presenter {
        void detachView();
        void loadMessage();
    }

    interface Model {
        void generateMessage();
    }

}
