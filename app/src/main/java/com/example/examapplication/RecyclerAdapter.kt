package com.example.examapplication

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter():RecyclerView.Adapter<ViewHolderOne>() {

    private var mutableList= mutableListOf(
        "ABC",
        "BRF",
        "DEF",
        "JEC",
        "MND"

    )

    override fun getItemViewType(position: Int): Int {
        Log.e("view type",position.toString())
        return super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderOne {
        val mContext=parent.context
        val layoutInflater=LayoutInflater.from(mContext)
        val view=layoutInflater.inflate(R.layout.recycler_item,parent,false)
        return ViewHolderOne(view)
    }

    override fun getItemCount(): Int {
        return mutableList.size
    }

    override fun onBindViewHolder(holder: ViewHolderOne, position: Int) {
        val name=mutableList[position]
        holder.txtview.text=name
    }

}