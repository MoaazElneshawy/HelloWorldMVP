package com.moaazfathyelneshawy.helloworldmvp.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.moaazfathyelneshawy.helloworldmvp.Model.MainContract;
import com.moaazfathyelneshawy.helloworldmvp.Presenter.MainPresenter;
import com.moaazfathyelneshawy.helloworldmvp.R;

public class MainActivity extends AppCompatActivity implements MainContract.IMainView {

    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);
    }

    public void makeToast(View view) {
        presenter.onButtonClicked();
    }

    @Override
    public void onTextReceived(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
