package com.moaazfathyelneshawy.helloworldmvp.Model;

public class MainModel implements MainContract.IMainModel {
    @Override
    public String getHelloWorld() {
        return "Hello World from MVP";
    }
}
