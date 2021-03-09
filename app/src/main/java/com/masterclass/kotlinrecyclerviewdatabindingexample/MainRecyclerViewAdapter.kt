package com.masterclass.kotlinrecyclerviewdatabindingexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainRecyclerViewAdapter(private val dataList: Array<String>): RecyclerView.Adapter<BaseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.recyclerview_row_item, parent, false)
        return BaseViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {

        holder.setName(dataList[position])

    }

    override fun getItemCount(): Int {
        return dataList.size
    }

}