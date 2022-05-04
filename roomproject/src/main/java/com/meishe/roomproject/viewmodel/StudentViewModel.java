package com.meishe.roomproject.viewmodel;


import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.meishe.roomproject.entity.Student;
import com.meishe.roomproject.repository.StudentRepository;

import java.util.List;

// AndroidViewModel 保证数据的稳定性
public class StudentViewModel extends AndroidViewModel {

    // LiveData

    private StudentRepository studentRepository; // 定义仓库 ViewModel只操作仓库

    public StudentViewModel(Application application) {
        super(application);

        studentRepository = new StudentRepository(application);
    }

    // 增
    public void insert(Student... students) {
        studentRepository.insert(students);
    }

    // 删
    public void delete(Student student) {
        studentRepository.delete(student);
    }

    // 改
    public void update(Student student) {
        studentRepository.update(student);
    }

    // 查 等下不同，因为他没有灵活
    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    // 查 关联 LiveData  【相当于 我的 ViewModel 也有同一份 LiveData】
    public LiveData<List<Student>> getAllLiveDataStudent() {
        return studentRepository.getAllLiveDataStudent();
    }
}
