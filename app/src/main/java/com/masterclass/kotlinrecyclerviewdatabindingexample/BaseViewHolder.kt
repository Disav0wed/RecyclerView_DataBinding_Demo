package com.masterclass.kotlinrecyclerviewdatabindingexample

import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.masterclass.kotlinrecyclerviewdatabindingexample.databinding.RecyclerviewRowItemBinding

class BaseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    private val binding = DataBindingUtil.bind<RecyclerviewRowItemBinding>(itemView)

    fun bind(name: String)
    {
        Log.e("BaseViewHolder",name)
        binding!!.nameTextView.text = name
    }

}