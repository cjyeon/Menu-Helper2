package com.example.menuhelper

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.menuhelper.databinding.MenulistitemBinding
import java.util.ArrayList

//class MenuListHolder(val binding: MenulistitemBinding): RecyclerView.ViewHolder(binding.root)
//
//class MenuListAdapter(val datas: MutableList<String>?): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
//
//    override fun getItemCount(): Int{
//        return datas?.size ?: 0
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
//            = MenuListHolder(MenulistitemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        val binding=(holder as MenuListHolder).binding
//        binding.tvMenuname.text= datas!![position]
//    }
//}

class MenuListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tv_menuname: TextView = itemView.findViewById(R.id.tv_menuname)
}

//class MenuListAdapter : RecyclerView.Adapter<MenuListViewHolder>() {
//    // OCR api 수정 필요 !!
//    private var mItems: List<Store> = ArrayList()
//
//    //UI 갱신
//    fun updateItems(items: List<Store>) {
//        mItems = items
//        notifyDataSetChanged()
//    }

//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuListViewHolder {
//        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.menulistitem, parent, false)
//        return MenuListViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: MenuListViewHolder, position: Int) {
//        val store = mItems[position]
//        holder.tv_menuname.text = store.name
//    }
//
//    override fun getItemCount(): Int = mItems.size
//}