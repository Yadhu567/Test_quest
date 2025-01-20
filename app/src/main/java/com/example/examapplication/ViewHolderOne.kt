package com.example.examapplication

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderOne(itemView: View):RecyclerView.ViewHolder(itemView) {
    val txtview=itemView.findViewById<TextView>(R.id.txt1)
}