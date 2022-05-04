package com.meishe.jetpackcollection.lifecycle.version1

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * @author : lpf
 * @FileName: MyLocationListener
 * @Date: 2022/5/3 14:33
 * @Description: 通过继承LifecycleObserver实现
 */
class MSObserverListener : LifecycleObserver {

     companion object{
          const val TAG:String="MSLocationListener";
     }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun create() = Log.d(TAG, "create----")

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun start() = Log.d(TAG, "start---- ")

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun resume() = Log.d(TAG, "resume---- ")

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun pause() = Log.d(TAG, "pause---- ")

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stop() = Log.d(TAG, "stop----")

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun destroy() = Log.d(TAG, "destroy---- ")

}