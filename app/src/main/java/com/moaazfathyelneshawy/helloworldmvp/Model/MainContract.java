package com.moaazfathyelneshawy.helloworldmvp.Model;

public class MainContract {

    public interface IMainView{
        void onTextReceived(String text);
    }

    public interface IMainModel{
        String getHelloWorld();
    }

    public interface IMainPresenter {
        void onButtonClicked();
    }

}
