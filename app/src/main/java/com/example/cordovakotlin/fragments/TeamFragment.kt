package com.example.cordovakotlin.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.cordovakotlin.CustomAdapter
import com.example.cordovakotlin.MainActivity
import com.example.cordovakotlin.R
import kotlinx.android.synthetic.main.fragment_team.*
import org.json.JSONArray
import org.json.JSONObject


class TeamFragment:Fragment(R.layout.fragment_team) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val personne1 = JSONObject();
        personne1.put("Name", "Clément");
        personne1.put("Role", "General Manager");
        val personne2 = JSONObject();
        personne2.put("Name", "Valentin");
        personne2.put("Role", "Manager");
        val personne3 = JSONObject();
        personne3.put("Name", "Florian");
        personne3.put("Role", "Employee");
        val personne4 = JSONObject();
        personne4.put("Name", "Edouard");
        personne4.put("Role", "Employee");
        val jsonArray = JSONArray()
        jsonArray.put(personne1)
        jsonArray.put(personne2)
        jsonArray.put(personne3)
        jsonArray.put(personne4)
        val data = arrayOf(
            arrayOf(personne1.optString("Name"),personne1.optString("Role")),
            arrayOf( personne2.optString("Name"),personne2.optString("Role")),
            arrayOf(personne3.optString("Name"),personne3.optString("Role")),
            arrayOf(personne4.optString("Name"),personne4.optString("Role"))
        )
        val context = context as MainActivity
        val arrayCustomAdapter = CustomAdapter(context,data)
        userlist?.adapter = arrayCustomAdapter
    }
}


