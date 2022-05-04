package com.meishe.jetpackcollection.livedata.version3

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.TextView
import com.meishe.jetpackcollection.BaseActivity
import com.meishe.jetpackcollection.R

/**
 * 验证数据倒灌
 */
class OtherLiveDataActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_live_data)
        val content:TextView=findViewById(R.id.content)

        MSLiveDataKT.with("info", String::class.java).observe(this){
            Log.d("lpf",it)
            content.text=it
        }

        Handler().postDelayed(Runnable {
            MSLiveDataKT.with("info", String::class.java).value = "新数据来啦"
        },2000)

    }
}