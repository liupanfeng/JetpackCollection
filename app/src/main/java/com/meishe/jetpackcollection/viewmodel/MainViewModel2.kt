package com.meishe.jetpackcollection.viewmodel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel

/**
 * @author : lpf
 * @FileName: MainViewModel2
 * @Date: 2022/5/4 10:07
 * @Description:
 */
class MainViewModel2(application: Application):AndroidViewModel(application) {

    // 定义一个环境
    var context: Context = application
}