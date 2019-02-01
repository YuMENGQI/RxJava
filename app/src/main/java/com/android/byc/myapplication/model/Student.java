package com.android.byc.myapplication.model;

import java.util.ArrayList;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/31 17:02
 * @description
 */
public class Student {

    public int id; //学号
    public String name; //姓名
    public ArrayList<Course> courses; //学生选修课的课程

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course=" + courses +
                '}';
    }
}
