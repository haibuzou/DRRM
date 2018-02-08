package com.example.liulei.drrm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.liulei.drrm.R;
import com.example.liulei.drrm.model.StudentModel;
import com.example.liulei.drrm.presenter.JavaPresenter;
import com.example.liulei.drrm.view.MainMvpView;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

public class JavaActivity extends AppCompatActivity implements MainMvpView{

//    @Inject
//    JavaPresenter javaPresenter;

    @Inject
    StudentModel studentModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        ((TextView)findViewById(R.id.content_txt)).setText(studentModel.name);
//        javaPresenter.attachView(this);
//        javaPresenter.requestData();
    }

    @Override
    public void toastMsg(@NotNull String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
