package com.meishe.jetpackcollection.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.meishe.jetpackcollection.R
import com.meishe.jetpackcollection.lifecycle.version2.MSObserver

class LifecycleActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MainActivity";
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)
        lifecycle.addObserver(MSObserver())
//        lifecycle.addObserver(MSObserverListener())

//        lifecycle.addObserver(MSInnerObserver())
    }

    /**
     * 通过内联函数实现，感知声明周期变化
     */
    inner class MSInnerObserver : LifecycleObserver {
        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        fun onResume() {
            Log.d(TAG, "inner onResume-----")
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        fun onPause() {
            Log.d(TAG, "inner onPause-----")
        }
    }
}