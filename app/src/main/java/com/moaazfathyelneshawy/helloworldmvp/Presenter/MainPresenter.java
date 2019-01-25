package com.moaazfathyelneshawy.helloworldmvp.Presenter;

import com.moaazfathyelneshawy.helloworldmvp.Model.MainContract;
import com.moaazfathyelneshawy.helloworldmvp.Model.MainModel;

public class MainPresenter implements MainContract.IMainPresenter {
    MainContract.IMainModel iMainModel;
    MainContract.IMainView iMainView;

    public MainPresenter(MainContract.IMainView iMainView) {
        this.iMainView = iMainView;
        iMainModel = new MainModel();
    }

    @Override
    public void onButtonClicked() {
        String helloWorld = iMainModel.getHelloWorld();
        iMainView.onTextReceived(helloWorld);
    }
}
