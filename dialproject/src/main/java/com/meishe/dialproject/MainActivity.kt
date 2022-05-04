package com.meishe.dialproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.meishe.dialproject.databinding.ActivityMainBinding

/**
 * 通过Jetpack实现，
 * 单一原则：只一件事情，管理绑定工作
 */
class MainActivity : AppCompatActivity() {

    private lateinit var mMainViewModel: MainViewModel
    private lateinit var mActivityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mActivityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        mMainViewModel=ViewModelProvider(this,
            ViewModelProvider.AndroidViewModelFactory(application)).get(MainViewModel::class.java)

        // viewModel  和 DataBinding 绑定起来
        mActivityMainBinding.mainViewModel=mMainViewModel


        //用于Model变化了，自动更改到View上  也就是数据驱动UI
        mActivityMainBinding.lifecycleOwner=this


    }
}