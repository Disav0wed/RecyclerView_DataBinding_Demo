package com.masterclass.kotlinrecyclerviewdatabindingexample

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BaseViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {

    var nameTextView = itemView.findViewById<TextView>(R.id.nameTextView)


    fun setName(name:String)
    {
        nameTextView.text = name
    }

}