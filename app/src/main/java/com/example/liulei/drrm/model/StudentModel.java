package com.example.liulei.drrm.model;

import javax.inject.Inject;

/**
 * Created by liulei on 2018/2/8.
 */

public class StudentModel {

    public String name;

    @Inject
    public StudentModel() {
        name = "hello";
    }
}
