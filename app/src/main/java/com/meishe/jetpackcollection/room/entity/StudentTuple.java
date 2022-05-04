package com.meishe.jetpackcollection.room.entity;


import androidx.room.ColumnInfo;

// @Entity 不能加，加了就是一张表了 只需要一张表的几个字段的情况
public class StudentTuple {

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name="pwd")
    public String password;

    public StudentTuple(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "StudentTuple{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
