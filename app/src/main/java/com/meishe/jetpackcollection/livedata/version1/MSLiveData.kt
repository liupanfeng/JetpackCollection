package com.meishe.jetpackcollection.livedata.version1

import androidx.lifecycle.MutableLiveData

/**
 * @author : lpf
 * @FileName: MSLiveData
 * @Date: 2022/5/3 15:29
 * @Description:
 */
object MSLiveData {
 /**
  * 懒加载，只用用的时候再加载
  */
 val info:MutableLiveData<String> by lazy {
        MutableLiveData()
    }

}