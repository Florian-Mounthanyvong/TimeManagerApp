package com.example.cordovakotlin

import android.os.Bundle
import android.view.MenuInflater
import android.view.View
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.cordovakotlin.fragments.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setCurrentFragment(StartFragment())

    }

    private fun setCurrentFragment(fragment:Fragment)=
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fFragment,fragment)
                commit()
        }

    private fun setCurrentTab(fragment:Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }

    fun connected(view: View) {
        setCurrentFragment(BarFragment())
        setCurrentTab(HomeFragment())
    }
    fun login(view: View) {
        setCurrentFragment(LoginFragment())
    }
    fun signingup(view: View) {
        setCurrentFragment(SignupFragment())
    }
    fun logout(view: View) {
        setCurrentTab(HomeFragment())
        setCurrentFragment(StartFragment())
    }
    fun showPopupUser(view: View) {
        val popup = PopupMenu(this, view)
        val inflater: MenuInflater = popup.getMenuInflater()
        inflater.inflate(R.menu.popup_menu, popup.getMenu())
        popup.show()
    }
    fun showPopupTime(view: View) {
        val popup = PopupMenu(this, view)
        val inflater: MenuInflater = popup.getMenuInflater()
        inflater.inflate(R.menu.popup_simple_menu, popup.getMenu())
        popup.show()
    }
}
