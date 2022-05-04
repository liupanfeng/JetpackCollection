package com.meishe.jetpackcollection.room.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.meishe.jetpackcollection.room.dao.StudentDao;
import com.meishe.jetpackcollection.room.entity.Student;


// 为了养成好习惯 规则 ，要写 exportSchema = false  导出模式
// 特色说法降级
@Database(entities = {Student.class}, version = 1, exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {

    // 暴露dao
    public abstract StudentDao userDao();

}
