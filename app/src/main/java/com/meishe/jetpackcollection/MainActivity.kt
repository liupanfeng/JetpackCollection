package com.meishe.jetpackcollection

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.meishe.jetpackcollection.databinding.ActivityMainBinding
import com.meishe.jetpackcollection.databinding.DataBindingActivity
import com.meishe.jetpackcollection.lifecycle.LifecycleActivity
import com.meishe.jetpackcollection.livedata.LiveDataActivity
import com.meishe.jetpackcollection.room.RoomActivity

/**
 * 最终继承了 LifecycleOwner addObserver 通过这个方法建立订阅关系
 */
class MainActivity : AppCompatActivity() {

    var mBinding:ActivityMainBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding?.root)

    }

    fun onTestLifecycle(view: View) {
        startActivity(Intent(this,LifecycleActivity::class.java))
    }

    fun onTestLiveData(view: View) {
        startActivity(Intent(this,LiveDataActivity::class.java))
    }

    fun onTestDataBinding(view: View) {
        startActivity(Intent(this,DataBindingActivity::class.java))
    }

    fun onTestRoom(view: View) {
        startActivity(Intent(this,RoomActivity::class.java))
    }


}