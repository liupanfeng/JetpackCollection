package com.meishe.jetpackcollection.room

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.meishe.jetpackcollection.databinding.ActivityRoomBinding
import com.meishe.jetpackcollection.room.dao.StudentDao
import com.meishe.jetpackcollection.room.db.AppDataBase
import com.meishe.jetpackcollection.room.entity.Student

class RoomActivity : AppCompatActivity() {

    var viewBinding:ActivityRoomBinding?=null
    lateinit var  useDao: StudentDao
    lateinit var mContext:Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityRoomBinding.inflate(layoutInflater)
        setContentView(viewBinding?.root)
        mContext=this;
        val appDataBase:AppDataBase = Room.databaseBuilder(applicationContext, AppDataBase::class.java, "LpfDb")
            .allowMainThreadQueries()
            .build()

        useDao = appDataBase.userDao()

    }

    fun onInsertRoom(view: View) {
        useDao.insert(Student("lpf", "123", 1))
        useDao.insert(Student("ltx", "456", 2))
        useDao.insert(Student("lrx", "789", 3))
    }


    fun onQueryAll(view: View) {
        val all:List<Student> = useDao.all
        for (student in all) {
            Log.d("lpf",student.name+" "+student.password)
        }
    }


}