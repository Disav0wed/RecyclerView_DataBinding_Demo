package com.masterclass.kotlinrecyclerviewdatabindingexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainRecyclerViewAdapter(private val dataList: List<String>, private val itemClickListener: (String) -> Unit): RecyclerView.Adapter<BaseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.recyclerview_row_item, parent, false)
        return BaseViewHolder(listItem)
    }


    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.bind(dataList[position], itemClickListener)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

}