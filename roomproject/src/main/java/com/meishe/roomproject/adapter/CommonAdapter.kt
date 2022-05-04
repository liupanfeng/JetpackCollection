package com.meishe.roomproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

/**
 * @author : lpf
 * @FileName: CommonAdapter
 * @Date: 2022/5/4 19:07
 * @Description:
 */
class CommonAdapter<T>(itemId: Int, variableId: Int) :
    RecyclerView.Adapter<CommonAdapter<T>.CommonViewHolder>() {

    var mData: List<T>? = null
    var mItemId: Int? = null
    var mVariableId: Int? = null

    init {
        mItemId = itemId
        mVariableId = variableId
    }

    fun setData(data: List<T>) {
        mData = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommonViewHolder {
        var dataBinding: ViewDataBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), mItemId!!, parent, false
        )
        return CommonViewHolder(dataBinding)
    }

    override fun onBindViewHolder(holder: CommonViewHolder, position: Int) {
        holder.mDataBinding?.setVariable(mVariableId!!, mData!![position])
        holder.mDataBinding?.executePendingBindings()
    }

    override fun getItemCount(): Int {
        return mData?.size ?: 0
    }


    inner class CommonViewHolder(dataBinding: ViewDataBinding) :
        RecyclerView.ViewHolder(dataBinding.root) {
        var mDataBinding: ViewDataBinding? = null

        init {
            mDataBinding = dataBinding
        }
    }
}