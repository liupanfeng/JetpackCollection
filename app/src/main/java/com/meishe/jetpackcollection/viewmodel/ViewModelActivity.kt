package com.meishe.jetpackcollection.viewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.meishe.jetpackcollection.R

class ViewModelActivity : AppCompatActivity() {

    private lateinit var mViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)

        // mViewModel = MainViewModel()  不能直接实例化，因为如果能这样写，系统不可控了

        // 旧版本的写法，更新特别快（扩展性不强）
        // ViewModelProviders.of()

        //初始化ViewModel的正确姿势
        mViewModel=ViewModelProvider(this).get(MainViewModel::class.java)

    }
}