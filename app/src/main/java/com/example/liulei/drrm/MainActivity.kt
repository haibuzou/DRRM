package com.example.liulei.drrm

import android.content.Context
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.liulei.drrm.presenter.MainPresenter
import com.example.liulei.drrm.view.MainMvpView
import javax.inject.Inject

class MainActivity : AppCompatActivity() , MainMvpView {

    @Inject
    lateinit var mPresenter:MainPresenter

    companion object {
        fun goToPage(context: Context){
            var intent = Intent(context,MainActivity::class.java)
//            intent.addFlags(FLAG_ACTIVITY_CLEAR_TOP)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter.attachView(this)
        mPresenter.requestData()
    }


    override fun toastMsg(msg: String) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }


}
