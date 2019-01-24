package com.arondillqs5328.daggermvpexample;

public interface MainContract {

    interface View {
        void showMessage(String message);
    }

    interface Presenter {
        void loadMessage();
        void setMessage(String message);
    }

    interface Model {
        void generateMessage();
    }

}
