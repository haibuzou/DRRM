package com.example.liulei.drrm.presenter;

import android.view.View;

import com.example.liulei.drrm.view.MainMvpView;

import javax.inject.Inject;

/**
 * Created by liulei on 2018/2/8.
 */

public class JavaPresenter {

    MainMvpView view;

    @Inject
    public JavaPresenter() {

    }

    public void attachView(MainMvpView view){
        this.view = view;
    }

    public void requestData(){
        view.toastMsg("hehe");
    }
}
