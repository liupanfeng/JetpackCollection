package com.meishe.jetpackcollection.room.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.meishe.jetpackcollection.room.entity.Student;
import com.meishe.jetpackcollection.room.entity.StudentTuple;

import java.util.List;

@Dao
public interface StudentDao {

    @Insert
    void insert(Student... students);

    @Delete
    void delete(Student student);

    @Update
    void update(Student student);

    @Query("select * from Student")
    List<Student> getAll();

    // 查询一条记录
    @Query("select * from Student where name like:name")
    Student findByName(String name);

    // 数组查询 多个记录
    @Query("select * from Student where uid in(:userIds)")
    List<Student> getAllId(int[] userIds);

    // 就是查询 name pwd  给 StudentTuple 类接收
    @Query("select name,pwd from Student")
    StudentTuple getRecord();
}
