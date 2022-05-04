package com.meishe.jetpackcollection.livedata.version2

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import com.meishe.jetpackcollection.livedata.version1.MSLiveData
import kotlin.concurrent.thread

/**
 * 模拟后台发送数据
 */
class MSService : Service() {

    override fun onBind(intent: Intent): IBinder ? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        thread {
            for (x in 1..50000) {
                Log.d("server", "服务器给推你推送消息,消息内容是:${x}")
                MSLiveData.info.postValue("服务器给推你推送消息啦,消息内容是:${x}")
                Thread.sleep(3000) // 3秒钟推一次
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }
}