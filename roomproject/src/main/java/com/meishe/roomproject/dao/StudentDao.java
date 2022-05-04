package com.meishe.roomproject.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.meishe.roomproject.entity.Student;

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

    // 使用 LiveData 关联 Room
    @Query("select * from Student order by uid")
    LiveData<List<Student>> getAllLiveDataStudent();
}
