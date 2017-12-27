package com.example.liulei.drrm;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.example.liulei.drrm.presenter.MainPresenter;
import com.example.liulei.drrm.view.MainMvpView;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

public class Main2Activity extends AppCompatActivity implements MainMvpView{

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mainPresenter.attachView(this);
        mainPresenter.requestData();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void toastMsg(@NotNull String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
