package com.example.liulei.drrm.presenter

import com.example.liulei.drrm.view.MainMvpView

/**
 * Created by liulei on 2017/12/27.
 */
class MainPresenter(var view: MainMvpView) {

    fun attachView(view: MainMvpView) {
        this.view = view
    }

    fun requestData(){
        view.toastMsg("hello")
    }
}