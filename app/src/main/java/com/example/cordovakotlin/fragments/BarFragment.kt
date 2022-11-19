package com.example.cordovakotlin.fragments

import android.os.Bundle
import android.view.View
import com.example.cordovakotlin.R
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_bar.*

class BarFragment:Fragment(R.layout.fragment_bar) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val firstFragment= HomeFragment()
        val secondFragment=TeamFragment()
        val thirdFragment= TimeFragment()
        val fourthFragment= PersonFragment()


        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home ->setCurrentTab(firstFragment)
                R.id.team->setCurrentTab(secondFragment)
                R.id.time->setCurrentTab(thirdFragment)
                R.id.person->setCurrentTab(fourthFragment)
            }
            true
        }

    }
    private fun setCurrentTab(fragment:Fragment)=
        parentFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }
}