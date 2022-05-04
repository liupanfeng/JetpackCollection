package com.meishe.dialproject

import android.app.Application
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

/**
 * @author : lpf
 * @FileName: MainViewModel
 * @Date: 2022/5/4 10:10
 * @Description:
 */
class MainViewModel(application: Application):AndroidViewModel(application) {

     val mContext:Context=application

     val phone by lazy { MutableLiveData<String>() }

     init {
         phone.value=""
     }


     fun appendNumber(number:String){
          Log.e("lpf",number);
          phone.value=phone.value+number
     }

     fun backspaceNumber() {
          var length=phone.value?.length?:-1
          if (length>0){
               // !! 我自己能够保证  不可能为null
               phone.value=phone.value?.substring(0, phone.value!!.length-1)
          }
     }

     fun clear(){
          phone.value=""
     }

     fun callPhone(){
          val intent=Intent()
          intent.action=Intent.ACTION_CALL
          intent.data= Uri.parse("tel:"+phone.value)
          intent.flags=Intent.FLAG_ACTIVITY_NEW_TASK   // 非Activity 启动隐式意图 奔溃， 需要加标记
          mContext.startActivity(intent)
     }


}