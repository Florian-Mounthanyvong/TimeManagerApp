package com.example.cordovakotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView

class CustomAdapter(private val context: Context, private val arrayList: Array<Array<String>>) : BaseAdapter() {
    private lateinit var name: TextView
    private lateinit var role: Button
    override fun getCount(): Int {
        return arrayList.size
    }
    override fun getItem(position: Int): Any {
        return position
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var convertView = convertView
        convertView = LayoutInflater.from(context).inflate(R.layout.listview_item, parent, false)
        name = convertView.findViewById(R.id.label)
        role = convertView.findViewById(R.id.button2)
        name.text = arrayList[position][0]
        role.text = arrayList[position][1]
        return convertView
    }
}