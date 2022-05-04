package com.meishe.roomproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.meishe.roomproject.adapter.CommonAdapter
import com.meishe.roomproject.databinding.ActivityMainBinding
import com.meishe.roomproject.entity.Student
import com.meishe.roomproject.viewmodel.StudentViewModel

class MainActivity : AppCompatActivity() {

    var mMainBinding:ActivityMainBinding?=null

    var mViewModel:StudentViewModel?=null
    lateinit var mAdaper:CommonAdapter<Student>

    var index:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mMainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mMainBinding?.root)

        initRecyclerView()
        mViewModel=ViewModelProvider(this,
            ViewModelProvider.AndroidViewModelFactory(application)).get(StudentViewModel::class.java)

        mViewModel?.allLiveDataStudent?.observe(this){
//            mAdaper.setData(it)
        }

        mMainBinding?.addData?.setOnClickListener {
            addData()
        }

//        databaseBuilder =
//            Room.databaseBuilder(applicationContext, AppDatabase::class.java, "LpfDB")
//                .allowMainThreadQueries()
//                .build()

    }

    private fun addData() {
        index++
        mViewModel?.insert(Student("lpf$index","123",1))
    }

    private fun initRecyclerView() {
//        mMainBinding?.recyclerView?.layoutManager =
//            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        mAdaper = CommonAdapter<Student>(R.layout.item_student, BR.studentInfo)
//        mMainBinding?.recyclerView?.adapter = mAdaper
    }
}