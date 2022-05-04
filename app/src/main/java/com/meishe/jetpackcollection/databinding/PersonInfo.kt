package com.meishe.jetpackcollection.databinding

import androidx.databinding.ObservableField

/**
 * @author : lpf
 * @FileName: StudentInfo
 * @Date: 2022/5/3 19:39
 * @Description:
 */
class PersonInfo {

 val name : ObservableField<String> by lazy { ObservableField<String>() }
 val pwd : ObservableField<String> by lazy { ObservableField<String>() }

}