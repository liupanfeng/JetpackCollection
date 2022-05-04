package com.meishe.jetpackcollection.databinding

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.meishe.jetpackcollection.BaseActivity
import com.meishe.jetpackcollection.R

class DataBindingActivity : BaseActivity() {

    private val personInfo = PersonInfo()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityDataBindingBinding? = DataBindingUtil.
            setContentView(this,R.layout.activity_data_binding)

        personInfo.name.set("Tom")
        personInfo.pwd.set("123456")

        binding?.personInfo=personInfo

    }
}