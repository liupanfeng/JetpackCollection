package com.meishe.roomproject.repository;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.meishe.roomproject.dao.StudentDao;
import com.meishe.roomproject.entity.Student;
import com.meishe.roomproject.room.AppDatabase;

import java.util.List;

// 仓库：我们的这个比较简单，一般的仓库要去设计
// 依赖倒置原则，接口隔离原则 ...
// 单例的
// 买房的例子 接口隔离层
public class StudentRepository {

    private LiveData<List<Student>> liveDataAllStudent; // 触发 改变的 LiveData的数据  【相当于 我的 ViewModel 也有同一份 LiveData】
    private StudentDao studentDao; // 用户操作 只面向DAO

    public StudentRepository(Context context) {
        AppDatabase database = AppDatabase.getInstance(context);
        studentDao = database.studentDao();
        if (liveDataAllStudent == null) {
            liveDataAllStudent = studentDao.getAllLiveDataStudent(); // 使用 LiveData 关联 Room
        }
    }

    // 下面代码是：提供一些API给ViewModel使用

    // 增
    public void insert(Student... students) {
        studentDao.insert(students);
    }

    // 删
    public void delete(Student student) {
        studentDao.delete(student);
    }

    // 改
    public void update(Student student) {
        studentDao.update(student);
    }

    // 查 等下不同，因为他没有灵活
    public List<Student> getAll() {
        return studentDao.getAll();
    }

    // 查 关联 LiveData 暴露环节
    public LiveData<List<Student>> getAllLiveDataStudent() {
        return studentDao.getAllLiveDataStudent();
    }
}
