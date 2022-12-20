package com.example.whatsapp

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class listadapter(namelist: Any, itemview: Any) : Adapter<listadapter.listadapter>() {
    var imglist = arrayOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img5,
        R.drawable.img6,
        R.drawable.img7,
        R.drawable.img8, R.drawable.img9, R.drawable.img10
    )
    var namelist = arrayOf(
        "john",
        "nick",
        "denial",
        "wick",
        "martin",
        "burg",
        "musk",
        "Lucifer",
        "martino",
        "zafer"
    )

    class listadapter(itemView: View) : ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): listadapter {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: listadapter, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}