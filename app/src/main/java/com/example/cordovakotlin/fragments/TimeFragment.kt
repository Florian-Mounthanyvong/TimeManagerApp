package com.example.cordovakotlin.fragments

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import com.example.cordovakotlin.R

import androidx.fragment.app.Fragment
import com.example.cordovakotlin.MainActivity
import kotlinx.android.synthetic.main.fragment_time.*

class TimeFragment:Fragment(R.layout.fragment_time) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val users = arrayOf(
            "Du 22/07/2022 10:12 Au 22/07/2022 18:12", "Du 22/07/2022 10:12 Au 22/07/2022 18:12", "Du 22/07/2022 10:12 Au 22/07/2022 18:12",
            "Du 22/07/2022 10:12 Au 22/07/2022 18:12"
        )
        val context = context as MainActivity
        val arrayAdapter = ArrayAdapter(context, R.layout.listview_simple_item,R.id.label, users)
        timelist?.adapter = arrayAdapter
    }
}
