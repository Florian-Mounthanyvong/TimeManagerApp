package com.example.cordovakotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cordovakotlin.R
import kotlinx.android.synthetic.main.fragment_home.*
import org.json.JSONObject


class HomeFragment:Fragment(R.layout.fragment_home) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_home, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val jsonObject = JSONObject();
        jsonObject.put("User", "Valentin");
        jsonObject.put("Lastweek", "42h53");
        jsonObject.put("Ratio","32%");
        jsonObject.put("Average", "9h17");
        val userString: String = jsonObject.toString()
        profile?.setText("Hello " + jsonObject.optString("User") + ",")
        lastweek?.setText("Last week you worked : \n" + jsonObject.optString("Lastweek"))
        ratio?.setText("Your Day/Night ratio is : \n" + jsonObject.optString("Ratio"))
        average?.setText("You work on average : \n" + jsonObject.optString("Average") + " per day")


    }
}
