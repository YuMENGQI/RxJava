package com.android.byc.myapplication.model;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/31 17:02
 * @description
 */
public class Course {
    public String name; //课程名称
    public int id; //课程编号

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name=" + name +'\'' +
                '}';
    }
}
