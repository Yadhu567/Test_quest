package com.example.examapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examapplication.R
import com.example.examapplication.RecyclerAdapter

class RecylerFragment:Fragment() {
    private lateinit var mRecyclerView: RecyclerView
    private var mAdapter: RecyclerAdapter =RecyclerAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView=inflater.inflate(R.layout.recycler_fragment,container,false)

        mRecyclerView=rootView.findViewById(R.id.recycler1)

        mRecyclerView.layoutManager=LinearLayoutManager(context,RecyclerView.VERTICAL,false)

        mRecyclerView.adapter=mAdapter

        return rootView
    }

    override fun onViewCreated(rootView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(rootView, savedInstanceState)
    }


}