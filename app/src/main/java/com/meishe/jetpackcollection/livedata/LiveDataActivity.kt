package com.meishe.jetpackcollection.livedata

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.meishe.jetpackcollection.BaseActivity
import com.meishe.jetpackcollection.databinding.ActivityLiveDataBinding
import com.meishe.jetpackcollection.livedata.version1.MSLiveData
import com.meishe.jetpackcollection.livedata.version2.MSService
import com.meishe.jetpackcollection.livedata.version3.MSLiveDataKT
import com.meishe.jetpackcollection.livedata.version3.OtherLiveDataActivity

class LiveDataActivity : BaseActivity() {

    var mBinding:ActivityLiveDataBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding= ActivityLiveDataBinding.inflate(layoutInflater)
        setContentView(mBinding?.root)

        mBinding?.button?.setOnClickListener{
            startService(Intent(this,MSService::class.java))
            Toast.makeText(LiveDataActivity@this,"启动服务后台模拟后台推送数据",Toast.LENGTH_LONG).show()
        }


        mBinding?.startToOtherActivity?.setOnClickListener{

//            MSLiveData.info.value = "飞跃，跃然纸上1" // 以前的旧数据
//            MSLiveData.info.value = "飞跃，跃然纸上2"
//            MSLiveData.info.value = "飞跃，跃然纸上3"

            MSLiveDataKT.with("info", String::class.java,false).value = "飞跃，跃然纸上3"

            startActivity(Intent(this,OtherLiveDataActivity::class.java))
        }

        MSLiveData.info.observe(this) {
            mBinding?.content?.text = it
            Log.d("server", "界面可见，更新消息列表UI界面:${it}")
        }

    }


}