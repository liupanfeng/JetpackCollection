package com.meishe.jetpackcollection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.meishe.jetpackcollection.lifecycle.version2.MSObserver

/**
 * @author : lpf
 * @FileName: BaseActivity
 * @Date: 2022/5/3 15:22
 * @Description:
 */
open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //在基类添加订阅关系
        lifecycle.addObserver(MSObserver())
    }


}