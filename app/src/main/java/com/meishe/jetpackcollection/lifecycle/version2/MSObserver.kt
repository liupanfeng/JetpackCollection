package com.meishe.jetpackcollection.lifecycle.version2

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

/**
 * @author : lpf
 * @FileName: MSOberser
 * @Date: 2022/5/3 14:40
 * @Description: 通过实现DefaultLifecycleObserver 来实现
 * 可以拿到 Activity Fragment 所有环境 ，可以展示Toast等
 */
class MSObserver: DefaultLifecycleObserver{

    companion object{
        const val TAG:String="MSObserver";
    }

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.d(TAG, "create---- 正在启动系统定位服务中...")
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.d(TAG, "start----")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d(TAG, "resume---- ")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.d(TAG, "pause----")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.d(TAG, "stop---- ")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.d(TAG, "destroy----")
    }
}